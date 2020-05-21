package com.bovespa.venda.integracao;

import com.bovespa.compra.integracao.Client;
import com.bovespa.compra.integracao.CompraResponse;
import com.bovespa.compra.mapper.CompraMapper;
import com.bovespa.compra.model.CompraEntity;
import com.bovespa.compra.model.CompraSaida;
import com.bovespa.compra.model.CompraSaida2;
import com.bovespa.compra.repository.CompraRepository;
import com.bovespa.venda.model.VendaEntrada;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@org.springframework.stereotype.Service
public class VendaService {

    @Autowired
    Client client;
    @Autowired
    CompraRepository compraRepository;

    public CompraSaida2 alterarAcao(VendaEntrada vendaEntrada) throws Exception {

        CompraEntity compraEntity;
        Optional<CompraEntity> retornoBanco = compraRepository.findById(vendaEntrada.getId());
        if (!retornoBanco.isPresent()){
            throw new Exception("Acao nao encontrada");
        }

        compraEntity = retornoBanco.get();

        CompraResponse compraResponse = client.getResponse(compraEntity.getSymbol());

        compraEntity.setQtd(compraEntity.getQtd() - vendaEntrada.getQtd());
        compraEntity.setBuy_price(compraResponse.getBuy_price());
        Double valorTotalDasAcoes = vendaEntrada.getQtd() * compraResponse.getBuy_price();
        compraEntity.setV_total(valorTotalDasAcoes);

        compraEntity = compraRepository.save(compraEntity);

        CompraSaida2 compraSaida = CompraMapper.Instance.entityParaSaida2(compraEntity);

        return compraSaida;

    }
}

package com.bovespa.compra.integracao;

import com.bovespa.compra.mapper.CompraMapper;
import com.bovespa.compra.model.CompraEntity;
import com.bovespa.compra.model.CompraEntrada;
import com.bovespa.compra.model.CompraSaida;
import com.bovespa.compra.repository.CompraRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {


    @Autowired
    Client client;
    @Autowired
    CompraRepository compraRepository;

    public CompraSaida getQuote(CompraEntrada compraEntrada) throws JsonProcessingException {

        CompraResponse compraResponse = client.getResponse(compraEntrada.getSymbol());

        Double v_total = compraEntrada.getQtd() * compraResponse.getBuy_price();

        CompraEntity compraEntity = CompraMapper.Instance.entradaParaEntity(compraEntrada, compraResponse, v_total);

        compraEntity = compraRepository.save(compraEntity);

        CompraSaida compraSaida = CompraMapper.Instance.entityParaSaida(compraEntity);

        return compraSaida;

    }
}

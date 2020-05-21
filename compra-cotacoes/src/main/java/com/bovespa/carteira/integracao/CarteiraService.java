package com.bovespa.carteira.integracao;

import com.bovespa.carteira.mapper.CarteiraMapper;
import com.bovespa.carteira.model.CarteiraSaida;
import com.bovespa.compra.integracao.Client;
import com.bovespa.compra.integracao.CompraResponse;
import com.bovespa.compra.model.CompraEntity;
import com.bovespa.compra.repository.CompraRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarteiraService {

    @Autowired
    CompraRepository compraRepository;
    @Autowired
    Client client;

    public CarteiraSaida buscarCarteira() throws JsonProcessingException {

        List<CompraEntity> wallet = compraRepository.findAll();

        Double total_money = 100000D;
        Double total_quotes = 0D;

        for (int i = 0; i < wallet.size(); i++){
            CompraResponse compraResponse = client.getResponse(wallet.get(i).getSymbol());
            wallet.get(i).setActual_price(compraResponse.getBuy_price());
            total_quotes = total_quotes + wallet.get(i).getV_total();
        }

        total_money = total_money - total_quotes;

        CarteiraSaida carteiraSaida = CarteiraMapper.INSTANCE.entityParaSaida(total_money, total_quotes, wallet);

        return carteiraSaida;
    }
}

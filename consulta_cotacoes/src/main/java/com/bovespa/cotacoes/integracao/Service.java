package com.bovespa.cotacoes.integracao;

import com.bovespa.cotacoes.mapper.AcaoMapper;
import com.bovespa.cotacoes.model.Acao;
import com.fasterxml.jackson.core.JsonProcessingException;

public class Service {

    Client client = new Client();

    AcaoMapper acaoMapper = new AcaoMapper();

    public Acao getQuote(String symbol) throws JsonProcessingException {

        Acao acao = acaoMapper.toAcao(client.getResponseQuote(symbol));

        return acao;

    }
}

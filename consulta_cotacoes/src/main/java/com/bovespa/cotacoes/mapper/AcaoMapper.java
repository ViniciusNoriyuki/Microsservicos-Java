package com.bovespa.cotacoes.mapper;

import com.bovespa.cotacoes.integracao.AcaoResponse;
import com.bovespa.cotacoes.model.Acao;

public class AcaoMapper {

    Acao acao = new Acao();

    public Acao toAcao(AcaoResponse acaoResponse){

        acao.setPrice(acaoResponse.getQuote().getPrice());

        return acao;

    }

}

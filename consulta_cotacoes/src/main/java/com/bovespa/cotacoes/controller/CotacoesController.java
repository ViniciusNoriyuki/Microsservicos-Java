package com.bovespa.cotacoes.controller;

import com.bovespa.cotacoes.integracao.Service;
import com.bovespa.cotacoes.model.Acao;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/cotacao"})
public class CotacoesController {

    Service service = new Service();

    @GetMapping
    public Acao buscaCotacao(@RequestParam String acao) throws JsonProcessingException {

        return service.getQuote(acao);

    }
}

package com.bovespa.carteira.controller;

import com.bovespa.carteira.integracao.CarteiraService;
import com.bovespa.carteira.model.CarteiraSaida;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/carteira"})
public class CarteiraController {

    @Autowired
    CarteiraService carteiraService;

    @GetMapping
    public CarteiraSaida buscarCarteira() throws JsonProcessingException {
        CarteiraSaida saida = carteiraService.buscarCarteira();

        return saida;
    }
}

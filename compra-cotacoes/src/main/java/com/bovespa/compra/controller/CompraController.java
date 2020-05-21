package com.bovespa.compra.controller;

import com.bovespa.compra.integracao.Service;
import com.bovespa.compra.model.CompraEntrada;
import com.bovespa.compra.model.CompraSaida;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/compra"})
public class CompraController {

    @Autowired
    Service service;

    @PostMapping
    public CompraSaida compraCotacao(@RequestBody CompraEntrada compraEntrada) throws JsonProcessingException {

        CompraSaida saida = service.getQuote(compraEntrada);
        return saida;

    }
}

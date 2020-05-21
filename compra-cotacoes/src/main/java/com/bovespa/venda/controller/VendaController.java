package com.bovespa.venda.controller;

import com.bovespa.compra.model.CompraSaida2;
import com.bovespa.venda.integracao.VendaService;
import com.bovespa.venda.model.VendaEntrada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

@Configuration
@CrossOrigin
@RestController
@RequestMapping({"/venda"})
public class VendaController {

    @Autowired
    VendaService vendaService;

    @PatchMapping
    public CompraSaida2 venderAcao(@RequestBody VendaEntrada vendaEntrada) throws Exception {

        CompraSaida2 saida = vendaService.alterarAcao(vendaEntrada);

        return saida;
    }
}

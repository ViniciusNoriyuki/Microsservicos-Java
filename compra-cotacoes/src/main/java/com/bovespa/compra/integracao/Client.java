package com.bovespa.compra.integracao;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Client {

    public CompraResponse getResponse(String symbol) throws JsonProcessingException {

        final String uri = "http://localhost:8080/cotacao?acao=" + symbol;

        RestTemplate restTemplate = new RestTemplate();

        CompraResponse result = restTemplate.getForObject(uri, CompraResponse.class);

        return result;
    }

}

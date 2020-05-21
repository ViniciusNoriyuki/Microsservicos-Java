package com.bovespa.cotacoes.integracao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.client.RestTemplate;

public class Client {

    public AcaoResponse getResponseQuote(String symbol) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        final String uri = "https://www.alphavantage.co/query?function=GLOBAL_QUOTE&symbol="+symbol+".SA&apikey=V7JEW3DNEMSXJJ05";

        RestTemplate restTemplate = new RestTemplate();

        AcaoResponse result = restTemplate.getForObject(uri, AcaoResponse.class);

        return result;
    }
}

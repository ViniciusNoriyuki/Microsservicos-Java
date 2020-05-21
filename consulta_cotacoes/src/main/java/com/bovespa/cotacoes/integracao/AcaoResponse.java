package com.bovespa.cotacoes.integracao;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AcaoResponse {

    @JsonProperty(value = "Global Quote")
    public Quote quote;

    @Getter
    @Setter
    public class Quote{
        @JsonProperty(value = "01. symbol")
        public String symbol;
        @JsonProperty(value = "02. open")
        public Double open;
        @JsonProperty(value = "03. high")
        public Double high;
        @JsonProperty(value = "04. low")
        public Double low;
        @JsonProperty(value = "05. price")
        public Double price;
        @JsonProperty(value = "06. volume")
        public Integer volume;
        @JsonProperty(value = "07. latest trading day")
        public String latest;
        @JsonProperty(value = "08. previous close")
        public Double previous;
        @JsonProperty(value = "09. change")
        public Double change;
        @JsonProperty(value = "10. change percent")
        public String change_percent;

    }
}

package com.bovespa.compra.integracao;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompraResponse {

    @JsonProperty(value = "price")
    public Double buy_price;
}

package com.bovespa.compra.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompraSaida {

    private String symbol;
    private Integer qtd;
    private Double v_total;
}

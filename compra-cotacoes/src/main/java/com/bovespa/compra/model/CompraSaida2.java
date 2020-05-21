package com.bovespa.compra.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompraSaida2 {

    private Long id;
    private Integer qtd;
    private Double v_total;
}

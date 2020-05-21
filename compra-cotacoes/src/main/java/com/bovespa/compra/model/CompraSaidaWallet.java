package com.bovespa.compra.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompraSaidaWallet {

    private Long id;
    private String symbol;
    private Integer qtd;
    private Double buy_price;
    private Double actual_price;
    private Double v_total;
}

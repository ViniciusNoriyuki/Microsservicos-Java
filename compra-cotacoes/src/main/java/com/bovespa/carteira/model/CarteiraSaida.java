package com.bovespa.carteira.model;

import com.bovespa.compra.model.CompraSaidaWallet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarteiraSaida {

    private Double total_money;
    private Double total_quotes;
    private List<CompraSaidaWallet> wallet;

}

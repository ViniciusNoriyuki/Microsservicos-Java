package com.bovespa.compra.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Acao")
public class CompraEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name="symbol")
    String symbol;

    @Column(name="qtd")
    Integer qtd;

    @Column(name="buy_price")
    Double buy_price;

    @Column(name="actual_price")
    Double actual_price;

    @Column(name="v_total")
    Double v_total;

}

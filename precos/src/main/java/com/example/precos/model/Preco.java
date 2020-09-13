package com.example.precos.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Preco {

    private Long codigoProduto;
    private BigDecimal preco;
}
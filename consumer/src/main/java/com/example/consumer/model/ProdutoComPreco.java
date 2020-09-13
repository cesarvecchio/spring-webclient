package com.example.consumer.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class ProdutoComPreco {

    private Long codigo;
    private String nome;
    private BigDecimal preco;

}

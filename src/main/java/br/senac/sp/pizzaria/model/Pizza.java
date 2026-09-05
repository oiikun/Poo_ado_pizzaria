package br.senac.sp.pizzaria.model;

import lombok.Data;

@Data
public class Pizza {
    private Long id;
    private String sabor;
    private String ingrediente;
    private TipoPizza tipo;
    private Tamanho tamanho;
    private double preco;
}

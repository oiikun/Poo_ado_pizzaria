package br.senac.sp.pizzaria.model;

import lombok.Data;

@Data
public class ItemPedido {
    private Long id;
    private Pizza pizza;
    private int quantidade;
    private double preco;

    public double getTotal(){
        return  quantidade * preco;
    }
}

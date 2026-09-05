package br.senac.sp.pizzaria.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Cliente {
    private Long id;
    private String nome;
    private String telefone;
    private String endereco;
    private LocalDate nascimento;
    private String cpf;
}

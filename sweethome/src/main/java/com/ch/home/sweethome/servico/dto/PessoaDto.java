package com.ch.home.sweethome.servico.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaDto {

    private Long id;
    private String nome;
    private String cpf;
    private double salario;
}

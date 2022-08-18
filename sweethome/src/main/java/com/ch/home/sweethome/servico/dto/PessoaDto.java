package com.ch.home.sweethome.servico.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Builder
public class PessoaDto implements Serializable {

    private Long id;
    private String nome;
    private String cpf;
    private double salario;
    private int idade;
}

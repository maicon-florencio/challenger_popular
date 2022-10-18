package com.ch.home.sweethome.servico.dto;

import com.ch.home.sweethome.dominio.Familia;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Builder
@Data
public class PessoaDTO implements Serializable {

    private Long id;
    private String nome;
    private String cpf;
    private double salario;
    private int idade;
    private Familia familia;
}

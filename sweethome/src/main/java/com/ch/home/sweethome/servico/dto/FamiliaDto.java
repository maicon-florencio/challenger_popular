package com.ch.home.sweethome.servico.dto;

import com.ch.home.sweethome.dominio.Pessoa;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class FamiliaDto {

    private Long id;
    private String sobrenomeFamilia;
    private List<Pessoa> familiares;
    private double rendaFamiliar;

}

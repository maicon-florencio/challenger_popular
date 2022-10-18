package com.ch.home.sweethome.servico.dto;

import com.ch.home.sweethome.servico.enumeration.Criterios;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Builder
public class FamiliaDTO {

    private Long id;
    private String sobreNomeFamilia;
    private List<PessoaDTO> familiares;
    private double rendaFamiliar;
    private List<Criterios> criterios;
    private int pontuacaoFamilia;
    public int pontuacaoTotal(FamiliaDTO familiaDto) {
        int pontuacao = 0;
        for (Criterios c: familiaDto.getCriterios()) {
            pontuacao += c.pontuacaoCriterios(familiaDto);
        }
        return pontuacao;
    }

}

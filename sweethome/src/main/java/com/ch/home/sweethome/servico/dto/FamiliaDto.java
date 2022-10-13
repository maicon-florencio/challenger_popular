package com.ch.home.sweethome.servico.dto;

import com.ch.home.sweethome.servico.enumeration.Criterios;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Builder
public class FamiliaDto {

    private Long id;
    private String sobrenomeFamilia;
    private List<PessoaDto> familiares;
    private double rendaFamiliar;
    private List<Criterios> criterios;
    private int pontuacaoFamilia;
    public int pontuacaoTotal(FamiliaDto familiaDto) {
        int pontuacao = 0;
        for (Criterios c: familiaDto.getCriterios()) {
            pontuacao += c.pontuacaoCriterios(familiaDto);
        }
        return pontuacao;
    }

}

package com.ch.home.sweethome.servico.enumeration;

import com.ch.home.sweethome.servico.negocio.CriteriosStrategy;
import com.ch.home.sweethome.servico.dto.FamiliaDTO;

public enum Criterios implements CriteriosStrategy {


    RENDA_TOTAL_FAMILIA_MAX_900 {@Override
        public int pontuacaoCriterios(FamiliaDTO familia) {
            return (familia.getRendaFamiliar() < 900)? 5:0;
        }
    },

    RENDA_TOTAL_FAMILIA_MAX_901_1500 {@Override
        public int pontuacaoCriterios(FamiliaDTO familia) {
            return ((familia.getRendaFamiliar() >=901) && (familia.getRendaFamiliar() <= 1500))? 3:0;
        }
    },

    FAMILIA_INTEGRANTES_MENOR_18 {@Override
    public int pontuacaoCriterios(FamiliaDTO familia) {
        final long tamanhoFamilia = familia.getFamiliares().
                stream()
                .filter(pessoa -> pessoa.getIdade() >= 18).count();
        return ((tamanhoFamilia >= 3 )? 3: 2);
     }
    }

}

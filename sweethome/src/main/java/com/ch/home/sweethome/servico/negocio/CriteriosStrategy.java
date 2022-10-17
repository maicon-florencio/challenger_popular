package com.ch.home.sweethome.servico.negocio;

import com.ch.home.sweethome.dominio.Familia;
import com.ch.home.sweethome.servico.dto.FamiliaDto;

public interface CriteriosStrategy {

    public int pontuacaoCriterios(FamiliaDto familia);
}

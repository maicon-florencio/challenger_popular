package com.ch.home.sweethome.servico.mapper.impl;

import com.ch.home.sweethome.dominio.Pessoa;
import com.ch.home.sweethome.servico.dto.PessoaDTO;
import com.ch.home.sweethome.servico.mapper.PessoaMapper;

public class PessoaMapperImpl implements PessoaMapper {
    @Override
    public PessoaDTO toDto(Pessoa p) {
        return INSTANCE.toDto(p);
    }

    @Override
    public Pessoa toEntity(PessoaDTO pDto) {
        return INSTANCE.toEntity(pDto);
    }
}

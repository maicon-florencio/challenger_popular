package com.ch.home.sweethome.servico.mapper;

import com.ch.home.sweethome.dominio.Pessoa;
import com.ch.home.sweethome.servico.dto.PessoaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {FamiliaMapper.class}, componentModel = "spring")
public interface PessoaMapper {

    PessoaMapper INSTANCE = Mappers.getMapper(PessoaMapper.class);

    PessoaDTO toDto(Pessoa p);

    Pessoa toEntity(PessoaDTO pDto) ;

}

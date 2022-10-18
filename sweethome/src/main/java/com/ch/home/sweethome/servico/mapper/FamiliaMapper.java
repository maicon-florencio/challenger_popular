package com.ch.home.sweethome.servico.mapper;

import com.ch.home.sweethome.dominio.Familia;
import com.ch.home.sweethome.servico.dto.FamiliaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {PessoaMapper.class})
public interface FamiliaMapper {

    FamiliaMapper INSTANCE = Mappers.getMapper(FamiliaMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "sobreNomeFamilia", target = "sobreNomeFamilia")
    @Mapping(source = "rendaFamiliar", target = "rendaFamiliar")
    @Mapping(source = "criterios", target = "criterios")
    @Mapping(source = "pontuacaoFamilia", target = "pontuacaoFamilia")
    @Mapping(source = "familiares", target = "familiares")
    FamiliaDTO toDTO(Familia f);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "sobreNomeFamilia", target = "sobreNomeFamilia")
    @Mapping(source = "rendaFamiliar", target = "rendaFamiliar")
    @Mapping(source = "criterios", target = "criterios")
    @Mapping(source = "pontuacaoFamilia", target = "pontuacaoFamilia")
    @Mapping(source = "familiares", target = "familiares")
    Familia toEntity(FamiliaDTO fDto);
}

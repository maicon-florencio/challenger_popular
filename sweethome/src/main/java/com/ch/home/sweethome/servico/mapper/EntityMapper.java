package com.ch.home.sweethome.servico.mapper;

public interface EntityMapper <D,E>{

    E toEntity(D dto);
    D toDto(E entity);

}

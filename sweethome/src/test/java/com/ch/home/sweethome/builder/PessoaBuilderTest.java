package com.ch.home.sweethome.builder;

import com.ch.home.sweethome.dominio.Pessoa;
import com.ch.home.sweethome.servico.dto.PessoaDto;
import org.springframework.stereotype.Component;

@Component
public class PessoaBuilderTest {

    public Pessoa mockEntityPessoaSemFamilia(){
        return  Pessoa.builder()
                .id(1L)
                .nome("Aleranddro")
                .idade(22).salario(1000.0).cpf("23438067056").build();
    }


    public PessoaDto mockDtoPessoaSemFamilia(){
        return  PessoaDto.builder()
                .id(1L)
                .nome("Aleranddro")
                .idade(22).salario(1000.0).cpf("23438067056").build();
    }

}

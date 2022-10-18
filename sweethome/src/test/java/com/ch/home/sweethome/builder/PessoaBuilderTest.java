package com.ch.home.sweethome.builder;

import com.ch.home.sweethome.dominio.Pessoa;
import com.ch.home.sweethome.servico.dto.PessoaDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PessoaBuilderTest {


    public List<Pessoa> mockEntityList() {
        List<Pessoa> persons = new ArrayList<Pessoa>();
        for (int i = 0; i < 14; i++) {
            persons.add(mockEntityPessoaSemFamilia(Long.parseLong(String.valueOf(i))));
        }
        return persons;
    }

    public List<PessoaDTO> mockVOList() {
        List<PessoaDTO> persons = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            persons.add(mockDtoPessoaSemFamilia(Long.parseLong(String.valueOf(i))));
        }
        return persons;
    }

    public Pessoa mockEntityPessoaSemFamilia(Long id){
        return  Pessoa.builder()
                .id(id)
                .nome("Aleranddro")
                .idade(22).salario(1000.0).cpf("23438067056").familia(null).build();
    }


    public PessoaDTO mockDtoPessoaSemFamilia(Long id){
        return  PessoaDTO.builder()
                .id(id)
                .nome("Aleranddro")
                .idade(22)
                .salario(1000.0)
                .cpf("23438067056").familia(null).build();
    }

}

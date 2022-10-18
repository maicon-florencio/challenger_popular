package com.ch.home.sweethome.builder;

import com.ch.home.sweethome.servico.dto.FamiliaDTO;
import com.ch.home.sweethome.servico.dto.PessoaDTO;
import com.ch.home.sweethome.servico.enumeration.Criterios;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component
public class FamiliaBuilderTest {


    public List<PessoaDTO> criarFamilia(){
        PessoaDTO pDto1 = PessoaDTO.builder()
                .id(1l)
                .nome("cassandra nunes").
                salario(196.0).cpf("12345").idade(15).build();
        PessoaDTO pDto2 = PessoaDTO.builder()
                .id(1l)
                .nome("Pedro nunes").
                salario(200.0).cpf("42332").idade(12).build();
        PessoaDTO pDto3 = PessoaDTO.builder()
                .id(1l)
                .nome("Roberto nunes").
                salario(234.0).cpf("87655").idade(14).build();
       return Arrays.asList(pDto1,pDto2,pDto3);
    }

    public List<Criterios> retornaListaDecriterios(){
        return Arrays.asList(Criterios.FAMILIA_INTEGRANTES_MENOR_18,Criterios.RENDA_TOTAL_FAMILIA_MAX_900);

    }

    public FamiliaDTO criarFamiliaSemRendaFamiliaEComCriterios(Long id){
        return FamiliaDTO.builder()
                .id(id).sobrenomeFamilia("nunes")
                .familiares(criarFamilia()).criterios(retornaListaDecriterios()).build();
    }

    public FamiliaDTO criarFamiliaComRendaFamiliaEComCriterios(Long id){
        return FamiliaDTO.builder()
                .id(id).sobrenomeFamilia("nunes")
                .rendaFamiliar(criarFamilia(

                ).stream().mapToDouble(pessoaDto -> pessoaDto.getSalario()).sum())
                .familiares(criarFamilia()).criterios(retornaListaDecriterios()).build();
    }

}

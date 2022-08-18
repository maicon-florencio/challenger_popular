package com.ch.home.sweethome.builder;

import com.ch.home.sweethome.servico.dto.FamiliaDto;
import com.ch.home.sweethome.servico.dto.PessoaDto;
import com.ch.home.sweethome.util.Criterios;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component
public class FamiliaBuilderTest {


    public List<PessoaDto> criarFamilia(){
        PessoaDto pDto1 = PessoaDto.builder()
                .id(1l)
                .nome("cassandra nunes").
                salario(196.0).cpf("12345").idade(15).build();
        PessoaDto pDto2 = PessoaDto.builder()
                .id(1l)
                .nome("Pedro nunes").
                salario(200.0).cpf("42332").idade(12).build();
        PessoaDto pDto3 = PessoaDto.builder()
                .id(1l)
                .nome("Roberto nunes").
                salario(234.0).cpf("87655").idade(14).build();
       return Arrays.asList(pDto1,pDto2,pDto3);
    }

    public List<Criterios> retornaListaDecriterios(){
        return Arrays.asList(Criterios.FAMILIA_INTEGRANTES_MENOR_18,Criterios.RENDA_TOTAL_FAMILIA_MAX_900);

    }

    public FamiliaDto criarFamiliaSemRendaFamiliaEComCriterios(Long id){
        return FamiliaDto.builder()
                .id(id).sobrenomeFamilia("nunes")
                .familiares(criarFamilia()).criterios(retornaListaDecriterios()).build();
    }

    public FamiliaDto criarFamiliaComRendaFamiliaEComCriterios(Long id){
        return FamiliaDto.builder()
                .id(id).sobrenomeFamilia("nunes")
                .rendaFamiliar(criarFamilia(

                ).stream().mapToDouble(pessoaDto -> pessoaDto.getSalario()).sum())
                .familiares(criarFamilia()).criterios(retornaListaDecriterios()).build();
    }

}

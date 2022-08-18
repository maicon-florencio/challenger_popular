package com.ch.home.sweethome.dominio;

import com.ch.home.sweethome.servico.dto.FamiliaDto;
import com.ch.home.sweethome.servico.dto.PessoaDto;
import com.ch.home.sweethome.util.Criterios;

import java.util.Arrays;
import java.util.List;

public class TesteClass {

    public static void main(String[] args) {
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
        List<PessoaDto> familia = Arrays.asList(pDto1,pDto2,pDto3);

        List<Criterios> cadastrosC = Arrays.asList(Criterios.FAMILIA_INTEGRANTES_MENOR_18,Criterios.RENDA_TOTAL_FAMILIA_MAX_900);

        FamiliaDto fm1 = FamiliaDto.builder()
                .id(1l).sobrenomeFamilia("nunes")
                .familiares(familia).criterios(cadastrosC).build();

        fm1.setRendaFamiliar(fm1.getFamiliares().stream().mapToDouble(pessoaDto -> pessoaDto.getSalario()).sum());

        fm1.setPontuacaoFamilia(fm1.pontuacaoTotal(fm1));

        System.out.println(" Valor de Pontuacao " + fm1.getPontuacaoFamilia());
        System.out.println(" Valor total renda "  + fm1.getRendaFamiliar());

    }
}

package com.ch.home.sweethome.mapper;

import com.ch.home.sweethome.builder.PessoaBuilderTest;
import com.ch.home.sweethome.dominio.Pessoa;
import com.ch.home.sweethome.servico.dto.PessoaDto;
import com.ch.home.sweethome.servico.mapper.GenericMapperClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


public class PessoaMapperTest {


    PessoaBuilderTest pessoaBuilder;
    @BeforeEach
    public void setUp(){
        pessoaBuilder = new PessoaBuilderTest();
    }

    @Test
    public void parseEntityToDto(){
        PessoaDto outPut =
                GenericMapperClass.parseObject(pessoaBuilder.mockEntityPessoaSemFamilia(1L), PessoaDto.class);
        Assert.assertEquals(Long.valueOf(1L), outPut.getId());
        Assert.assertEquals(22, outPut.getIdade());
        Assert.assertEquals("Aleranddro", outPut.getNome());
        Assert.assertEquals("23438067056", outPut.getCpf());

    }

    @Test
    public void parseDtotoEntity(){
        Pessoa outPut =
                GenericMapperClass.parseObject(pessoaBuilder.mockDtoPessoaSemFamilia(1L), Pessoa.class);
        Assert.assertEquals(Long.valueOf(1L), outPut.getId());
        Assert.assertEquals(22, outPut.getIdade());
        Assert.assertEquals("Aleranddro", outPut.getNome());
        Assert.assertEquals(1000.0, outPut.getSalario());
        Assert.assertEquals("23438067056", outPut.getCpf());

    }

}

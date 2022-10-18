package com.ch.home.sweethome.mapper;

import com.ch.home.sweethome.builder.PessoaBuilderTest;
import com.ch.home.sweethome.dominio.Pessoa;
import com.ch.home.sweethome.servico.dto.PessoaDTO;
import com.ch.home.sweethome.servico.mapper.PessoaMapper;
import com.ch.home.sweethome.servico.mapper.impl.PessoaMapperImpl;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@AutoConfigureMockMvc
public class PessoaMapperTest {

    @Autowired
   private  PessoaBuilderTest pessoaBuilder;
    private PessoaMapperImpl pessoaMapper;



    @Test
    public void parseEntityToDto(){
        Pessoa p = pessoaBuilder.mockEntityPessoaSemFamilia(1L);

        PessoaDTO dto = pessoaMapper.toDto(p);
        Assert.assertEquals(p.getNome(), dto.getNome());

    }

    @Test
    public void parseDtotoEntity(){
        Pessoa outPut =
                pessoaMapper.toEntity(pessoaBuilder.mockDtoPessoaSemFamilia(1L));
        Assert.assertEquals(Long.valueOf(1L), outPut.getId());
        Assert.assertEquals(22, outPut.getIdade());
        Assert.assertEquals("Aleranddro", outPut.getNome());
        Assert.assertEquals(1000.0, outPut.getSalario());
        Assert.assertEquals("23438067056", outPut.getCpf());

    }

}

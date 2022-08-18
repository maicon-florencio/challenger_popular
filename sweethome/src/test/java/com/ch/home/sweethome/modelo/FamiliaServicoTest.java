package com.ch.home.sweethome.modelo;

import com.ch.home.sweethome.builder.FamiliaBuilderTest;
import com.ch.home.sweethome.servico.dto.FamiliaDto;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
@AutoConfigureMockMvc
public class FamiliaServicoTest {

    @Autowired
    private FamiliaBuilderTest familiaBuilderTest;

    @Test
    public void verificandoRendafamiliar(){
        FamiliaDto dto =  familiaBuilderTest.criarFamiliaComRendaFamiliaEComCriterios(2l);
        Assert.assertNotNull(dto.getRendaFamiliar() > 0);

    }

    @Test
    public void verificandoPontuacaoFamiliar(){
        FamiliaDto dto =  familiaBuilderTest.criarFamiliaComRendaFamiliaEComCriterios(2l);
        dto.setPontuacaoFamilia(dto.pontuacaoTotal(dto));
        Assert.assertNotNull(dto.getRendaFamiliar() > 0);
        Assert.assertTrue(dto.getPontuacaoFamilia() > 0);


    }

}

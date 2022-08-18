package com.ch.home.sweethome.rest;

import com.ch.home.sweethome.SweethomeApplication;
import com.ch.home.sweethome.builder.PessoaServiceBuilder;
import com.ch.home.sweethome.servico.dto.PessoaDto;
import com.ch.home.sweethome.util.UtilTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
@WebMvcTest
@AutoConfigureMockMvc
public class PessoaResourceTest {

    final String API= "/api/pessoa";

    @Autowired
   private MockMvc mockMvc;

    @Autowired
    private PessoaServiceBuilder pbuilder;


    @Test
   public void salvarPessoaComSucesso() throws Exception {
        PessoaDto pessoaDto =  pbuilder.criarEntidadeNaoSalva();
    }



}

package com.ch.home.sweethome.rest;

import com.ch.home.sweethome.builder.PessoaServiceBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@Transactional
public class PessoaResourceTest {

    final String API= "/api/pessoa";

    private final PessoaServiceBuilder pbuilder;

    public PessoaResourceTest(PessoaServiceBuilder pbuilder) {
        this.pbuilder = pbuilder;
    }

    @Test
   public void salvarPessoaComSucesso(){
       PessoaDto pessoaDto =  pbuilder.criarEntidadeNaoSalva();


   }



}

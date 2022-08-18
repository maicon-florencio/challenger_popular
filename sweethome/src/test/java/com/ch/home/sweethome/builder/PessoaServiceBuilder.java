package com.ch.home.sweethome.builder;

import com.ch.home.sweethome.servico.dto.PessoaDto;
import org.springframework.stereotype.Component;

import java.util.Random;
@Component
public class PessoaServiceBuilder {


    public PessoaDto criarEntidadeNaoSalva() {
        return PessoaDto.builder().
                    id(null).nome("Lucas Queiroz")
                .cpf(gerarCpfAletorio()).salario(1000.0).build();
    }


     String gerarCpfAletorio(){
        return String.valueOf(new Random().nextInt(10000));
    }

}

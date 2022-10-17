package com.ch.home.sweethome.dominio;

import com.ch.home.sweethome.Util.ConstantesUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@Entity
@Builder
@NoArgsConstructor
@Table(name = "Pessoa")
public class Pessoa implements Serializable {

    private static final long serialVersionUID= 1L;

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "ID_PESSOA")
    private Long id;
    private String nome;
    private String cpf;
    private double salario;
    @JoinColumn(name = "ID_FAMILIA" , referencedColumnName = ConstantesUtil.ID)
    @ManyToOne(fetch = FetchType.LAZY)
    private Familia familia;

    private int idade;
}

package com.ch.home.sweethome.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "Pessoa")
public class Pessoa implements Serializable {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "ID_PESSOA")
    private Long id;
    private String nome;
    private String cpf;
    private double salario;
    @JoinColumn(name = "ID_FAMILIA" , referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Familia familia;

    private int idade;
}

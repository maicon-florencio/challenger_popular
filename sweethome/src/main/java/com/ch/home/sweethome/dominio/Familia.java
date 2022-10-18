package com.ch.home.sweethome.dominio;

import com.ch.home.sweethome.servico.enumeration.Criterios;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "FAMILIA")
public class Familia implements Serializable {
    private static final long serialVersionUID= 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sobreNomeFamilia;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name="FAMILIA_PESSOA",
            joinColumns={@JoinColumn(name = "ID_PESSOA")},
            inverseJoinColumns={@JoinColumn(name = "ID_FAMILIA")})
    private List<Pessoa> familiares;

    private Criterios criterios;
    private int pontuacaoFamilia;

    private double rendaFamiliar;

}

package com.backPortfolio.apiRest.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String descripcion_Habilidades;
    private String porcentaje_Habilidades;

    public Skill(){

    }

    public Skill(Long id, String descripcion_Habilidades, String porcentaje_Habilidades) {
        this.id = id;
        this.descripcion_Habilidades = descripcion_Habilidades;
        this.porcentaje_Habilidades = porcentaje_Habilidades;
    }
}
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
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre_Proyecto;
    private String descripcion_Proyecto;

    public  Proyecto() {

    }

    public Proyecto(Long id, String nombre_Proyecto, String descripcion_Proyecto) {
        this.id = id;
        this.nombre_Proyecto = nombre_Proyecto;
        this.descripcion_Proyecto = descripcion_Proyecto;
    }
}

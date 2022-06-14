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
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre_Institucion;
    private String nombre_Carrera;
    private String fecha_Inicio;
    private String fecha_Fin;
    private String imagen_De_Institucion;

    public Educacion(){

    }

    public Educacion(String nombre_Institucion, String nombre_Carrera, String fecha_Inicio, String fecha_Fin, String imagen_De_Institucion) {
        this.nombre_Institucion = nombre_Institucion;
        this.nombre_Carrera = nombre_Carrera;
        this.fecha_Inicio = fecha_Inicio;
        this.fecha_Fin = fecha_Fin;
        this.imagen_De_Institucion = imagen_De_Institucion;
    }
}

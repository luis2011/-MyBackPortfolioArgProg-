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
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String descripcion_Trabajo;
    private String nombre_Empresa;
    private String tipo_Jornada;
    private String fecha_Entrada;
    private String fecha_Salida;
    private String localidad;
    private String pais;

    private String imagen_De_Empresa;

    public Experiencia(){

    }

    public Experiencia(long id, String descripcion_Trabajo, String nombre_Empresa, String tipo_Jornada, String fecha_Entrada, String fecha_Salida, String localidad, String pais, String imagen_De_Empresa) {
        this.id = id;
        this.descripcion_Trabajo = descripcion_Trabajo;
        this.nombre_Empresa = nombre_Empresa;
        this.tipo_Jornada = tipo_Jornada;
        this.fecha_Entrada = fecha_Entrada;
        this.fecha_Salida = fecha_Salida;
        this.localidad = localidad;
        this.pais = pais;
        this.imagen_De_Empresa = imagen_De_Empresa;
    }
}

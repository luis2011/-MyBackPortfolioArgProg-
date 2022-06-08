package com.backPortfolio.apiRest.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


// 49:43
@Getter
@Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String titulo;
    private String acercaDe;
    private String imagenDePerfil;

    public Persona() {

    }

    public Persona(long id, String nombre, String apellido, String email, String telefono, String titulo, String acercaDe, String imagenDePerfil) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.titulo = titulo;
        this.acercaDe = acercaDe;
        this.imagenDePerfil = imagenDePerfil;
    }
}

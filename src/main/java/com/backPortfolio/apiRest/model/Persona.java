package com.backPortfolio.apiRest.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


// 49:43
@Getter
@Setter
@Entity
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String titulo;
    private String acerca_De;
    private String imagen_De_Perfil;



    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_domicilio", referencedColumnName = "id_domicilio")
    private Domicilio domicilio;

    public Persona() {

    }

    public Persona(long id, String nombre, String apellido, String email, String telefono, String titulo, String acerca_De, String imagen_De_Perfil, Domicilio domicilio) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.titulo = titulo;
        this.acerca_De = acerca_De;
        this.imagen_De_Perfil = imagen_De_Perfil;
        this.domicilio = domicilio;
    }
}

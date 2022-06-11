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
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String direccion;

    private String codigoPostal;

    private String localidad;

    private String pais;



    public Domicilio(){

    }

    public Domicilio(long id, String direccion, String codigoPostal, String localidad, String pais) {
        this.id = id;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.localidad = localidad;
        this.pais = pais;

    }
}

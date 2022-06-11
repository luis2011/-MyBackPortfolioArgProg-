package com.backPortfolio.apiRest.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
public class Domicilio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="ID_DOMICILIO")
    private long id_domicilio;

    private String direccion;

    private String codigo_Postal;

    private String localidad;

    private String pais;



    public Domicilio(){

    }

    public Domicilio(long id_domicilio, String direccion, String codigo_Postal, String localidad, String pais) {
        this.id_domicilio = id_domicilio;
        this.direccion = direccion;
        this.codigo_Postal = codigo_Postal;
        this.localidad = localidad;
        this.pais = pais;
    }
}

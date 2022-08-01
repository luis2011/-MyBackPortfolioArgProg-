package com.backPortfolio.apiRest.security.service;

import com.backPortfolio.apiRest.model.Domicilio;

import java.util.List;

public interface IDomicilioService {
    public List<Domicilio> verDomicilio();

    public void crearDomicilio(Domicilio dom);

    public void editarDomicilio(Domicilio dom);

    public void borrarDomicilio (Long id);

    public Domicilio buscarDomicilio(Long id);
}

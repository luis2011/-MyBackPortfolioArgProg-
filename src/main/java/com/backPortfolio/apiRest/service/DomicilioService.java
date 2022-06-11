package com.backPortfolio.apiRest.service;

import com.backPortfolio.apiRest.model.Domicilio;
import com.backPortfolio.apiRest.repository.IDomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomicilioService implements  IDomicilioService{

    @Autowired
    public IDomicilioRepository domRepo;

    @Override
    public List<Domicilio> verDomicilio() {
        return domRepo.findAll();
    }

    @Override
    public void crearDomicilio(Domicilio dom) {
        domRepo.save(dom);
    }

    @Override
    public void editarDomicilio(Domicilio dom) {
        domRepo.save(dom);
    }

    @Override
    public void borrarDomicilio(Long id) {
        domRepo.deleteById(id);
    }

    @Override
    public Domicilio buscarDomicilio(Long id) {
        return domRepo.findById(id).orElse(null);
    }
}

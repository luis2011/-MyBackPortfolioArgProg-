package com.backPortfolio.apiRest.security.service;

import com.backPortfolio.apiRest.model.Persona;
import com.backPortfolio.apiRest.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    // inyecto IPersonaRepository
    public IPersonaRepository persoRepo;

    @Override
    public List<Persona> verPersonas() {
        return  persoRepo.findAll();

    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }
    @Override
    public void editarPersona(Persona per) {
        persoRepo.save(per);
    }


    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {

        return  persoRepo.findById(id).orElse(null);

    }
}

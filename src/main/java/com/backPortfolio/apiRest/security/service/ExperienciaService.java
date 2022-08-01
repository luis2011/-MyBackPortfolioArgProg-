package com.backPortfolio.apiRest.security.service;

import com.backPortfolio.apiRest.model.Experiencia;
import com.backPortfolio.apiRest.repository.IExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienciaService implements IExperienciaService {

    @Autowired
    public IExperienciaRepository expRepo;

    @Override
    public List<Experiencia> verExperiencias() {
        return expRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia experiencia) {
            expRepo.save(experiencia);
    }

    @Override
    public void editarExperiencia(Experiencia experiencia) {
            expRepo.save(experiencia);
    }

    @Override
    public void borrarExperiencia(Long id) {
            expRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return expRepo.findById(id).orElse(null);
    }
}

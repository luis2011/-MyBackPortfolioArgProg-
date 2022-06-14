package com.backPortfolio.apiRest.service;

import com.backPortfolio.apiRest.model.Experiencia;
import java.util.List;

public interface IExperienciaService {

    public List<Experiencia> verExperiencias();

    public void crearExperiencia (Experiencia experiencia);

    public void editarExperiencia (Experiencia experiencia);

    public void borrarExperiencia ( Long id);

    public Experiencia buscarExperiencia ( Long id);

}

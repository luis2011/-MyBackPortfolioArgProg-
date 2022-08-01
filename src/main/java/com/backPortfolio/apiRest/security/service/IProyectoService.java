package com.backPortfolio.apiRest.security.service;

import com.backPortfolio.apiRest.model.Proyecto;
import java.util.List;

public interface IProyectoService {

    public List<Proyecto> verProyecto();

    public void crearProyecto (Proyecto proyecto);

    public void editarProyecto (Proyecto proyecto);

    public void borrarProyecto ( Long id);

    public Proyecto buscarProyecto ( Long id);
}

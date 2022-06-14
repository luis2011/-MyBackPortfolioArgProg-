package com.backPortfolio.apiRest.service;

import com.backPortfolio.apiRest.model.Proyecto;
import com.backPortfolio.apiRest.repository.IProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectoService implements IProyectoService {


    @Autowired
    public IProyectoRepository proyServ;

    @Override
    public List<Proyecto> verProyecto() {
        return proyServ.findAll();
    }

    @Override
    public void crearProyecto(Proyecto proyecto) {
        proyServ.save(proyecto);
    }

    @Override
    public void editarProyecto(Proyecto proyecto) {
        proyServ.save(proyecto);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyServ.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        return proyServ.findById(id).orElse(null);
    }
}

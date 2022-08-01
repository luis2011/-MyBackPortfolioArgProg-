package com.backPortfolio.apiRest.controller;


import com.backPortfolio.apiRest.model.Experiencia;
import com.backPortfolio.apiRest.security.service.IExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ExperienciaController {
    @Autowired
    private IExperienciaService expServ;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new/experiencia")
    public void agregarExperiencia(@RequestBody Experiencia experiencia){
        expServ.crearExperiencia(experiencia);
    }

    @GetMapping("/ver/experiencia")
    @ResponseBody
    public List<Experiencia> verExperiencias(){
        return expServ.verExperiencias();
    }


    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping ("experiencia/{id}")
    public Experiencia buscarExperiencia(@PathVariable Long id){
        return expServ.buscarExperiencia(id);
    }


    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/edit/experiencia")
    public void editarExperiencia(@RequestBody Experiencia experiencia){
        expServ.editarExperiencia(experiencia);
    }


    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/experiencia/{id}")
    public void borrarExperiencia (@PathVariable Long id){
        expServ.borrarExperiencia(id);
    }

}

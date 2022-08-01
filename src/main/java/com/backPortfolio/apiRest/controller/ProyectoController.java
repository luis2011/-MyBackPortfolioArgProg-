package com.backPortfolio.apiRest.controller;

import com.backPortfolio.apiRest.model.Proyecto;
import com.backPortfolio.apiRest.security.service.IProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ProyectoController {

    @Autowired
    private IProyectoService proyServ;

     @PreAuthorize("hasRole('ADMIN')")
     @PostMapping("/new/proyecto")
     public void agregarProyecto(@RequestBody Proyecto proyecto) {
         proyServ.crearProyecto(proyecto);
     }

     @GetMapping("/ver/proyecto")
     @ResponseBody
     public List<Proyecto> verProyecto(){
        return proyServ.verProyecto();
     }

     @PreAuthorize("hasRole('ADMIN')")
     @GetMapping ("/proyecto/{id}")
     public Proyecto buscarProyecto(@PathVariable Long id){
        return proyServ.buscarProyecto(id);
     }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/edit/proyecto")
    public void editarProyecto(@RequestBody Proyecto proyecto) {
        proyServ.editarProyecto(proyecto);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/proyecto/{id}")
    public void borrarProyecto (@PathVariable Long id){
         proyServ.borrarProyecto(id);
    }

}

package com.backPortfolio.apiRest.controller;

import com.backPortfolio.apiRest.model.Educacion;
import com.backPortfolio.apiRest.security.service.IEducacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class EducacionController {
    @Autowired
    private IEducacionService eduServ;

     @PreAuthorize("hasRole('ADMIN')")
     @PostMapping("/new/educacion")
     public void agregarEducacion(@RequestBody Educacion edu) {
         eduServ.crearEducacion(edu);
     }

     @GetMapping("/ver/educacion")
     @ResponseBody
     public List<Educacion> verEducacion(){
        return eduServ.verEducacion();
     }

     @PreAuthorize("hasRole('ADMIN')")
     @GetMapping ("educacion/{id}")
     public Educacion buscarEducacion(@PathVariable Long id){
        return eduServ.buscarEducacion(id);
     }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/edit/educacion")
    public void editarEducacion(@RequestBody Educacion edu) {
        eduServ.editarEducacion(edu);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/educacion/{id}")
    public void borrarEducacion (@PathVariable Long id){
         eduServ.borrarEducacion(id);
    }

}

package com.backPortfolio.apiRest.controller;


import com.backPortfolio.apiRest.model.Persona;
import com.backPortfolio.apiRest.security.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// explicacion 1:30 relacion entre todas las capas
@RestController
@CrossOrigin(origins = "*")
public class PersonaController {

  @Autowired
  private IPersonaService persoServ;

  @PreAuthorize("hasRole('ADMIN')")
  @PostMapping ("/new/persona")
    public void agregarPersona(@RequestBody Persona pers){
        persoServ.crearPersona(pers);
  }

  @GetMapping ("/ver/persona")
  @ResponseBody
    public List<Persona> verPersonas (){
        return persoServ.verPersonas();
  }

  @PreAuthorize("hasRole('ADMIN')")
    @GetMapping ("persona/{id}")
    public Persona buscarPersona(@PathVariable Long id){
    return  persoServ.buscarPersona(id);
  }

  @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/edit/persona")
    public void editarPersona(@RequestBody Persona pers){
        persoServ.editarPersona(pers);
    }
    @PreAuthorize("hasRole('ADMIN')")
  @DeleteMapping ("/delete/{id}")
  public void borrarPersona (@PathVariable Long id){
        persoServ.borrarPersona(id);

  }

}

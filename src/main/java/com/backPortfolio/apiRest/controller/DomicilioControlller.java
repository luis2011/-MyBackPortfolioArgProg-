package com.backPortfolio.apiRest.controller;

import com.backPortfolio.apiRest.security.service.IDomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class DomicilioControlller {

    @Autowired
    private IDomicilioService domServ;

   /*
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new/domicilio")
    public void agregarDomicilio(@RequestBody Domicilio dom){
        domServ.crearDomicilio(dom);
    }

    @GetMapping ("/ver/domicilio")
    @ResponseBody
    public List<Domicilio> verDomicilio(){
        return domServ.verDomicilio();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/edit/domicilio")
    public void editarDomicilio(@RequestBody Domicilio dom){
        domServ.editarDomicilio(dom);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/domicilio/{id}")
    public void borrarDomicilio (@PathVariable Long id){
        domServ.borrarDomicilio(id);
    }
    
    */
}

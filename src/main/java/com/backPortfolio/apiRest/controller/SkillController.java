package com.backPortfolio.apiRest.controller;

import com.backPortfolio.apiRest.model.Skill;
import com.backPortfolio.apiRest.service.ISkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class SkillController {

    @Autowired
    private ISkillService skillServ;

     @PreAuthorize("hasRole('ADMIN')")
     @PostMapping("/new/skill")
     public void agregarSkill(@RequestBody Skill skill) {
          skillServ.crearSkill(skill);
     }

     @GetMapping("/ver/skill")
     @ResponseBody
     public List<Skill> verSkill(){
        return skillServ.verSkill();
     }

     @PreAuthorize("hasRole('ADMIN')")
     @GetMapping ("/skill/{id}")
     public Skill buscarSkill(@PathVariable Long id){
        return skillServ.buscarSkill(id);
     }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/edit/skill")
    public void editarSkill(@RequestBody Skill skill) {
        skillServ.editarSkill(skill);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/skill/{id}")
    public void borrarSkill (@PathVariable Long id){
         skillServ.borrarSkill(id);
    }
}

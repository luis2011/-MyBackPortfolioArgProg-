package com.backPortfolio.apiRest.security.service;

import com.backPortfolio.apiRest.model.Skill;
import com.backPortfolio.apiRest.repository.ISkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService implements ISkillService{

    @Autowired
    public ISkillRepository skillRepo;
    @Override
    public List<Skill> verSkill() {
        return skillRepo.findAll();
    }

    @Override
    public void crearSkill(Skill skill) {
        skillRepo.save(skill);
    }

    @Override
    public void editarSkill(Skill skill) {
        skillRepo.save(skill);
    }

    @Override
    public void borrarSkill(Long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public Skill buscarSkill(Long id) {
        return skillRepo.findById(id).orElse(null);
    }
}

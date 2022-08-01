package com.backPortfolio.apiRest.security.service;

import com.backPortfolio.apiRest.model.Skill;

import java.util.List;

public interface ISkillService {

    public List<Skill> verSkill();

    public void crearSkill (Skill skill);

    public void editarSkill (Skill skill);

    public void borrarSkill ( Long id);

    public Skill buscarSkill ( Long id);

}

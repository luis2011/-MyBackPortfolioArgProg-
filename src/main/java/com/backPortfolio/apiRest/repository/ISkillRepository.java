package com.backPortfolio.apiRest.repository;

import com.backPortfolio.apiRest.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkillRepository  extends JpaRepository<Skill, Long> {
}

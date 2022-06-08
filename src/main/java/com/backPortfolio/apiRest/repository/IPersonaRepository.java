package com.backPortfolio.apiRest.repository;

import com.backPortfolio.apiRest.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// 1:18 min
@Repository
public interface IPersonaRepository extends JpaRepository<Persona , Long> {

}

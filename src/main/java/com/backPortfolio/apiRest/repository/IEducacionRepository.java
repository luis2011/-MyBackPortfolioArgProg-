package com.backPortfolio.apiRest.repository;

import com.backPortfolio.apiRest.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepository extends JpaRepository<Educacion, Long> {
}

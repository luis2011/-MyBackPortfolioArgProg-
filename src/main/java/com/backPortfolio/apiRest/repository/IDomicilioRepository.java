package com.backPortfolio.apiRest.repository;

import com.backPortfolio.apiRest.model.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDomicilioRepository  extends JpaRepository<Domicilio , Long> {

}

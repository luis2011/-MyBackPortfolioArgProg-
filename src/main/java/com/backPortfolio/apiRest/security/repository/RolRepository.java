package com.backPortfolio.apiRest.security.repository;

import com.backPortfolio.apiRest.security.entity.Rol;
import com.backPortfolio.apiRest.security.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}

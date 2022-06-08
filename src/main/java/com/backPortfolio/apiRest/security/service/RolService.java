package com.backPortfolio.apiRest.security.service;

import com.backPortfolio.apiRest.security.repository.RolRepository;
import com.backPortfolio.apiRest.security.entity.Rol;
import com.backPortfolio.apiRest.security.enums.RolNombre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        rolRepository.save(rol);
    }
}

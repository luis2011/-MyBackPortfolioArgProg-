package com.backPortfolio.apiRest.service;

import com.backPortfolio.apiRest.model.Persona;

import java.util.List;

public interface IPersonaService {

        public List<Persona> verPersonas();
        public void crearPersona( Persona per);
        public void editarPersona(Persona per);
        public void borrarPersona(Long id);
        public Persona buscarPersona(Long id);


}

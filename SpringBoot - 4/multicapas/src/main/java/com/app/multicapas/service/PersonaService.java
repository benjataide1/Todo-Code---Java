package com.app.multicapas.service;

import com.app.multicapas.model.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

// Metodos de logica de negocio

@Service
public class PersonaService implements IPersonaService {

    @Override
    public void createPersona(Persona persona) {
        //Logica de creacion
        System.out.println("Persona creada");

    }

    @Override
    public List<Persona> readAllPersonas() {
        //Logica de devolver la lista de personas
        return List.of();
    }

}

package com.jpa.demo.service;

import com.jpa.demo.model.Persona;
import java.util.List;


public interface IPersonaService {

    //GET
    public List<Persona> getAll();

    //CREATE
    public void savePersona(Persona persona);

    //DELETE
    public void deletePersona(Long id);

    //FIND by ID
    public Persona findPersonaById(Long id);

    //UPDATE
    public void  updatePersona(Long idOriginal, Long idNueva, String nuevoNombre, String nuevoAppelido,int nuevaEdad );

    public void editPersona(Persona persona);

}

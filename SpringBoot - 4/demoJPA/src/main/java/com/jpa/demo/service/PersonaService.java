package com.jpa.demo.service;

import com.jpa.demo.model.Persona;
import com.jpa.demo.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {

    //PersonaRepository sera la clase encargada de proporcionarnos los datos
    @Autowired
    private IPersonaRepository personaRepository;

    @Override
    public List<Persona> getAll() {
        List<Persona> personas = personaRepository.findAll();
        personaRepository.findAll();
        return personas;
    }

    @Override
    public void savePersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona findPersonaById(Long id) {
        Persona person = personaRepository.findById(id).orElse(null);
        return person;
    }

    @Override
    public void updatePersona(Long idOriginal, Long idNueva, String nuevoNombre, String nuevoAppelido, int nuevaEdad) {
        //buscamos al objeto
        Persona personaFind = this.findPersonaById(idOriginal);

        //cambiamos los valores
        personaFind.setId(idNueva);
        personaFind.setName(nuevoNombre);
        personaFind.setLastname(nuevoAppelido);
        personaFind.setAge(nuevaEdad);

        //guardamos los cambios
        this.savePersona(personaFind);

    }

    @Override
    public void editPersona(Persona persona) {
        this.savePersona(persona); //ademas del alta , tambien modifica el save()
    }
}

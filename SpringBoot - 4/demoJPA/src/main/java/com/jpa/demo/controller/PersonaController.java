package com.jpa.demo.controller;

import com.jpa.demo.model.Persona;
import com.jpa.demo.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    IPersonaService personaService;

    //GET
    @GetMapping("/personas/get")
    public List<Persona> getPersonas(){
        return personaService.getAll();
    }

    //CREATE
    @PostMapping("/personas/create")
    public String  createPersona(@RequestBody Persona persona){
        personaService.savePersona(persona);
        return "Person Create Success";
    }

    //DELETE
    @DeleteMapping("personas/delete/{id}")
    public String deletePersona(@PathVariable Long id){
        personaService.deletePersona(id);
        return "Person Delete Success";
    }

    //UPDATE
    //required false para que no sea obligatorio enviar todos los parametros, si no se envian se mantendran los valores originales
    @PutMapping("personas/update/{idOriginal}")
    public Persona updatePersona(@PathVariable Long idOriginal,
                                 @RequestParam(required = false,name = "idNueva") Long idNueva,
                                 @RequestParam(required = false,name = "name") String nuevoNombre,
                                 @RequestParam(required = false,name = "lastname") String nuevoApellido,
                                 @RequestParam(required = false,name = "edad") int nuevaEdad){

        personaService.updatePersona(idOriginal,idNueva,nuevoNombre,nuevoApellido,nuevaEdad);

        return personaService.findPersonaById(idNueva);

    }


    //Update Persona pero mas de una manera mas facil
    @PutMapping("personas/update")
    public Persona actualizarPersona(@RequestBody Persona persona){
        personaService.editPersona(persona);
        return personaService.findPersonaById(persona.getId());

    }




}

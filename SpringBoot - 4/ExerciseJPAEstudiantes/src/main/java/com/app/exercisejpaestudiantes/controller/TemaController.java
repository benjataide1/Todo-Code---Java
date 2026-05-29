package com.app.exercisejpaestudiantes.controller;


import com.app.exercisejpaestudiantes.model.Tema;
import com.app.exercisejpaestudiantes.service.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TemaController {

    @Autowired
    private TemaService temaService;

    @GetMapping("/temas")
    public List<Tema> getTemas() {
        return temaService.getTemas();
    }

    @PostMapping("/tema/create")
    public String createTema(@RequestBody Tema tema) {
        temaService.saveTema(tema);
        return "Tema create Success";
    }

    @DeleteMapping("/tema/delete/{id}")
    public String deleteTema(@PathVariable Long id) {
        temaService.deleteTema(id);
        return "Tema delete Success";
    }

    @PutMapping("/tema/update/{idOriginal}")
    public Tema updateTema(@PathVariable Long idOriginal,@RequestParam Long idNuevo, @RequestParam String nuevoNombre, @RequestParam String nuevaDescripcion) {
        temaService.editTema(idOriginal, idNuevo, nuevoNombre, nuevaDescripcion);
        return temaService.findTema(idNuevo);
    }


}

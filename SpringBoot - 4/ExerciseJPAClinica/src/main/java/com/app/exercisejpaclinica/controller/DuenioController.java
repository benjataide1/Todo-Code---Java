package com.app.exercisejpaclinica.controller;

import com.app.exercisejpaclinica.model.Duenio;
import com.app.exercisejpaclinica.service.DuenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DuenioController {

    @Autowired
    DuenioService duenioService;

    //GET
    @GetMapping("/duenios")
    public List<Duenio> findAllDuenios() {
        return duenioService.getAllDuenios();
    }

    //CREATE
    @PostMapping("/duenio/create")
    public String createDuenio(@RequestBody Duenio duenio) {
        return duenioService.saveDuenio(duenio);
    }

    //DELETE
    @DeleteMapping("/duenio/delete/{id}")
    public String deleteDuenio(@PathVariable Long id) {
        return duenioService.deleteDuenio(id);
    }

    //FIND
    @GetMapping("/duenio/find/{id}")
    public Duenio findDuenioById(@PathVariable Long id) {
        return duenioService.findDuenioById(id);
    }

    //UPDATE
    @PutMapping("/duenio/update")
    public String updateDuenio(@RequestBody Duenio duenio) {
        return duenioService.saveDuenio(duenio);
    }



}

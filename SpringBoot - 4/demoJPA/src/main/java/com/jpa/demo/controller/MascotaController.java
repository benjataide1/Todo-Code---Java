package com.jpa.demo.controller;

import com.jpa.demo.model.Mascota;
import com.jpa.demo.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {

    @Autowired
    MascotaService mascotaService;

    //CREATE
    @PostMapping("/mascota/create")
    public String  createMascota(@RequestBody Mascota mascota){
       mascotaService.saveMascota(mascota);
        return "Person Create Success";
    }
}

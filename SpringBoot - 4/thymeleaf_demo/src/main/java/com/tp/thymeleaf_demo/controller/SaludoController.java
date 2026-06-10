package com.tp.thymeleaf_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//!RestController: Devuelve un JSON
@Controller //! Devuelve un HTML
public class SaludoController {

    @GetMapping("/saludo")
    public String saludo() { //Siempre devuelve un String a la hora de mostrar una plantilla
        return "saludo"; //! Retornamos el nombre del archivo html que queremos mostrar
    }
}

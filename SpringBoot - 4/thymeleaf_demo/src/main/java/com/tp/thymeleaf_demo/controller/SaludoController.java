package com.tp.thymeleaf_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller//Duelve un HTML
public class SaludoController {

    @GetMapping("/saludo") //localhost:8080/saludo?name="benjamin"
    public String saludo(@RequestParam String name,
                         Model model) { //! Con model hago referencia al modelado del HTML
                                       //! puedo crear y agregar a un atributo el valor del parametro

        model.addAttribute("name", name);
        return "saludo"; //nombre del archivo html
    }
}

package com.tp.thymeleaf_demo.controller;

import com.tp.thymeleaf_demo.model.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonaController {

    @GetMapping("/persona")
    public String mostrarFormulario(Model model) {
        model.addAttribute("persona", new Persona()); //Pasamos al formulario el Objeto Persona
        return "formulario"; //retornamos el formulario.html
    }

    @PostMapping("/procesar")
    public String procesarFormulario(Persona persona, Model model) {
        //Recibimos por parametro al objeto persona creado en el formulario

        //Mando como atributo al Objeto persona
        model.addAttribute("persona", persona);

        if (persona.getAge() >= 18) {
            model.addAttribute("tipoEdad", "Mayor de edad");
        } else {
            model.addAttribute("tipoEdad", "Menor de edad");
        }

        return "resultado";
    }
}

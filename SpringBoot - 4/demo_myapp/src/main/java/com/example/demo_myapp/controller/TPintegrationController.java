package com.example.demo_myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TPintegrationController {

    @GetMapping("/convert/{galon}")
    public String  galonALitros(@PathVariable double galon){
     double litros = galon * 3.78541;
     return "The amount of litros is: " + litros;
    }


}

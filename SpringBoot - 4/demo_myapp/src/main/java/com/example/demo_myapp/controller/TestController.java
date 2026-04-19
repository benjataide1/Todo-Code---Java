package com.example.demo_myapp.controller;

import org.springframework.web.bind.annotation.*;

//@RestController - Esto es una API o EndPoint
@RestController // Puedo Agrega un Prefijo ("/url")
public class TestController {

    @GetMapping("/") // ("/url")
    public String sayHello(){
     return "Spring Boot is a tool for develop APIs in Java";
    }

    //? PathVariable, Pass parameters in the URL
    @GetMapping("/hi/{name}")
    public String sayMyName(@PathVariable String name){
        return "Hello "+name;
    }

    @GetMapping("/full/{name}/{lastname}/{age}")
    public String fullInformation(@PathVariable String name, @PathVariable String lastname, @PathVariable Integer age){
        return "Hello: "+name+" "+lastname+" - "+age;
    }

}

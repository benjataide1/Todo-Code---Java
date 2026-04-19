package com.example.demo_myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController - Esto es una API o EndPoint
@RestController("/test") // ("/url")
public class TestController {

    @GetMapping("/hello") // ("/url")
    public String sayHello(){
     return "Say Hello";
    }


}

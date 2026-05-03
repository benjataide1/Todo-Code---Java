package com.example.demo_myapp.controller;

import com.example.demo_myapp.Client;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ResponseBodyController {

    @GetMapping("/client/getAll")
    @ResponseBody // Especificamos que los datos devueltos por este método deben ser convertidos a JSON y enviados en el cuerpo de la respuesta HTTP
    public List<Client> getClients() {
        List<Client> clients = new ArrayList<Client>();
        clients.add(new Client(1L, "Benjamin", "Ataide"));
        clients.add(new Client(2L, "Maria", "Gonzalez"));
        clients.add(new Client(3L, "Juan", "Perez"));
        return clients;
    }


    // GET /testresponse
    // Devuelve un texto de prueba y un estado 200 (OK).
    // Usamos ResponseEntity para poder controlar el status (y si querés, también headers).
    @GetMapping("/testresponse")
    ResponseEntity<String> getResponse() {
        // Construye una respuesta HTTP 200 (OK) con un cuerpo de texto.
        return new ResponseEntity<>("Hello World, Page Not Found", HttpStatus.NOT_FOUND);
    }
}

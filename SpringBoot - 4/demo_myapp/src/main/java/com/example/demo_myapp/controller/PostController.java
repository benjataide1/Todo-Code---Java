package com.example.demo_myapp.controller;

import com.example.demo_myapp.Client;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    // En la URL, El usuario accede a esa direccion y se crea el usuario.
    @PostMapping("/client")
    // Para yo saber que los datos que me llegan son del metodo PostMapping,  tengo que recirib como parametro @RequestBody
    public void createClient(@RequestBody Client client) {

        /**
         {
         "id":1,
         "name":"Benjamin",    @RequestBody -> Client client = new Client(1,"Benjamin","Ataide")
         "lastname":"Ataide"
         }
         */

        System.out.println(client.getName());
        System.out.println(client.getLastname());
        System.out.println(client.getId());

        System.out.println("Nombre: " + client.getName() + ", Lastname: " + client.getLastname() + ", Id: " + client.getId());
        System.out.println("Create Client");
    }

}

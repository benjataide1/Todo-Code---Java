package com.example.demo_myapp;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Client {

    private Long id;
    private String name;
    private String lastname;

    public Client(Long id, String lastname, String name) {
        this.id = id;
        this.lastname = lastname;
        this.name = name;
    }
}

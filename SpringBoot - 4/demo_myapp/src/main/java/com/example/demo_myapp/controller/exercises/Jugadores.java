package com.example.demo_myapp.controller.exercises;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Jugadores {
    private Long id;
    private Integer dni;
    private String nombre;
    private String apellido;
    private Integer edad;
    private Double peso;
    private Double altura;

}

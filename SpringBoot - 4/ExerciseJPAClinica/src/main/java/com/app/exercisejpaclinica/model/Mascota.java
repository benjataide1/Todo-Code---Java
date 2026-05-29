package com.app.exercisejpaclinica.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nombre;
    private String especie;
    private String raza;
    private String color;

    @OneToOne
    @JoinColumn(name = "unDuenio",referencedColumnName = "id")
    private Duenio unDuenio;
}

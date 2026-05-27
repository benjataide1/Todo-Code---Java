package com.jpa.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String lastname;
    private  int age;

    @OneToOne
    @JoinColumn(name = "mascota_id" , referencedColumnName = "id_mascota")
    //1 - name = Nombre de la columna que hace referencia a la tabla mascota en la tabla persona
    //2 - referencedColumnName = nombre de la columna id en la tabla mascota
    private Mascota unaMascota;
}

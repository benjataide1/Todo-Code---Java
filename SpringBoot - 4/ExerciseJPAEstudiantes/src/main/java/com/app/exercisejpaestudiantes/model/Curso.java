package com.app.exercisejpaestudiantes.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter @Service
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_curso;

    private String nombre;
    private String modalidad;
    private String fecha_finalizacion;

    @OneToMany
    private List<Tema> listaDeTemas;
}

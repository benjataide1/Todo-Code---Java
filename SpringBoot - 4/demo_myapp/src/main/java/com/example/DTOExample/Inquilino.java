package com.example.DTOExample;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Inquilino {

    private Long id_inquilino;
    private String dni;
    private String nombre;
    private String apellido;
    private String profesion;

}


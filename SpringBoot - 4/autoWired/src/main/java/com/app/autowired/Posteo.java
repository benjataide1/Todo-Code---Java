package com.app.autowired;


import lombok.Getter;
import lombok.Setter;

//lombok nos permite resumir los getters y setters
//mediante annotations
@Getter
@Setter
public class Posteo {

    private Long id;
    private String titulo;
    private String autor;

    public Posteo(Long id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

}

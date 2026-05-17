package com.app.autowired;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PosteoRepository implements IPosteoInterface {

    @Override
    public List<Posteo> getListaPosteo() {

        List<Posteo> listaPosteos = new ArrayList<Posteo>();
        listaPosteos.add(new Posteo(1L, "¿Cómo formatear una PC?", "Luisina de Paula"));
        listaPosteos.add(new Posteo(2L, "¿Cómo mantener la seguridad?", "Gabriel Guismín"));

        return listaPosteos;
    }

}
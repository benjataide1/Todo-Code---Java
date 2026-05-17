package com.app.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PosteoController {

    //El autowired inyecta la dependencia
    //sin necesidad de crear un nuevo objeto
    @Autowired
    IPosteoInterface repository; // LLamo a la interface y su metodo, pero busca la clase que alla implementadoa esa interface, en este caso PosteoRepository

    @GetMapping("/posteos")
    public List<Posteo> traerTodos() {
        /*
        Esto seria lo logico
        PosteoRepository posteoRepository = new PosteoRepository();
        return posteoRepository.getListaPosteo();
        */
        return repository.getListaPosteo();
    }

}

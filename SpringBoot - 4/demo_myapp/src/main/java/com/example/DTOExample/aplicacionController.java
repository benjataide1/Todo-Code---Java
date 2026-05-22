package com.example.DTOExample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aplicacionController {

    @GetMapping("/propiedad/{id}")
    @ResponseBody
    public PropiedadDTO devolverPropiedad(@PathVariable long id) {
        //Imaginamos que con el id que nos pasan buscamos en la BD
        // que a traves de la id buscamos la propiedad
        // Trajimos al inquilo asociado a esa propiedad

        Propiedad propiedad = new Propiedad(1231L, "Casa", "Calle Falsa 123", 120.0, 1500.0);
        Inquilino inquilino = new Inquilino(456L, "12345678A", "Juan", "Perez", "Abogado");

//        PropiedadDTO propiedadDTO = new PropiedadDTO(propiedad.getId_propiedad(), propiedad.getTipo_propiedad(), propiedad.getDireccion(), propiedad.getValor_alquiler(), inquilino.getNombre(), inquilino.getApellido());
        PropiedadDTO propiedadDTO = new PropiedadDTO();

        //Asignamos los datos que necesitamos de propiedad
        propiedadDTO.setId_propiedad(propiedad.getId_propiedad());
        propiedadDTO.setTipo_propiedad(propiedad.getTipo_propiedad());
        propiedadDTO.setDireccion(propiedad.getDireccion());
        propiedadDTO.setValor_alquiler(propiedad.getValor_alquiler());
        //Asignamos los datos que necesitamos de Inquilino
        propiedadDTO.setNombre(inquilino.getNombre());
        propiedadDTO.setApellido(inquilino.getApellido());

        return propiedadDTO;
    }

}

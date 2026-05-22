package com.example.demo_myapp.controller.exercises;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlumnoController {

    @GetMapping("/alumno")
    public String getPromedio(@RequestParam Integer notaUno, @RequestParam Integer notaDos, @RequestParam Integer notaTres){

        return "Promedio: " + (notaUno + notaDos + notaTres) / 3;

    }


    @GetMapping("/area/{base}/{altura}")
    public  String calculateArea(@PathVariable int base, @PathVariable int altura){
        double areaC = (base * altura)/ 2.0;
        return "Area is: " + areaC;
}

    @PostMapping("/jugadores")
    public String promedioAltura(@RequestBody List<Jugadores> jugadores) {

        double sumaAltura = 0;
        int count = 0;

        for (Jugadores jugador : jugadores) {
            if (jugador != null && jugador.getAltura() != null) {
                sumaAltura += jugador.getAltura();
                count++;
            }
        }


        return "Promedio altura: " + (sumaAltura / count);
    }


}


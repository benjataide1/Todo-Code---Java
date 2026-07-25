package com.tec.ReferenciaAMetodos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main() {
        /**
         * Una referencia a metodos permite usar un metodo ya existente sin tener que escribir una funcion anonima o lambda
         * Valor::valor apasar
         * Function <T Valor de Entrada , Valor de retorno R > nombre = Clase::metodo
         */

        //Function<String, Ingteger> convertidor = s -> Integer.parseInt(s);
        Function<String , Integer> convertidor = Integer::parseInt;
        System.out.println(convertidor.apply("123"));


        //? Referencia a un metodo de instancia de un objeto
        Persona persona = new Persona();
        persona.nombre = "Pedro";

        Runnable saludo = persona::saludar;
        saludo.run();

        //? Referencia a un Constructor
            //BiFunction<Dos valores de entrada,Valor de salida >
        BiFunction<String,Double, Persona> crearPersona = Persona::new;
        Persona persona2 = crearPersona.apply("Benja",1.67);
        System.out.println(persona2);

        //Persona persona2 = new Persona("Benja",1.67);

        //? Referencia a un metodo de instancia de un objeto arbitrario
        List<Persona> personas = new ArrayList<>();
        personas.add(new Empleado());
        personas.add(new Gerente());
        personas.add(new Empleado());
        personas.add(new Gerente());

        personas.forEach(Persona::saludar);
    }

}

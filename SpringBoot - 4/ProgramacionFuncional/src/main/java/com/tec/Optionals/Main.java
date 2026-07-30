package com.tec.Optionals;

import java.util.Optional;

public class Main {

    static void main() {
        /*
        * Optional Es una clase
           Su objetivo es proporcionar una forma mas segura de manejar valores que pueden ser:
           Nulos y evitar el clasico error de "NullPointerException".

        * Busca evitar que salga el Error Null

         Metodos - vacio (Existe pero no tiene valor)
        * empty(): Crea un Optional vacio
        * of(valor): Crea un Optional con una valor (lanza excepcion si es null) - Devuelve si o si un valor
        * ofNullable(valor): Crea un Optional que puede estar vacio si el valor es null - Devuelve un valor o devuelve null
        */

        // Optional<Valor que retorna o es> nombreVariable = Metodo Optional
        Optional<String> stringNull =  Optional.ofNullable(null);

        if(stringNull.isEmpty()) {
            System.out.println("El valor es: null");
        }else  {
            System.out.println("El valor es: " + stringNull.get());
        }

        Optional<String> cadena = Optional.of("Hola");
        if(cadena.isEmpty()){
            System.out.println("Es vacia");
        }else{
            System.out.println("Tiene un valor");
        }

        Optional<String> cadena2 = Optional.empty();

        if(cadena2.isEmpty()){
            System.out.println("Es vacia");
        }else {
            System.out.println("Tiene un valor");
        }

    }
}

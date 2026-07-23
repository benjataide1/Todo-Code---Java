package com.tec.ExpresionesLambda;

import com.tec.ExpresionesLambda.logica.Mensajero;

public class Main {

    /**
     * -- Las expresiones Lambda es una forma corta de escribir funciones o bloques de codigo,
        * permitiendo una sintaxis más concisa y legible.

     * -- (parametro/sin parametro) -> {sentencia}

     * -- Para poder utilizar expresiones Lambdas, es necesario implementar Interfaces Funcionales
        * Podemos crear nuestras propias interfaces funcionales.
        * La anotacion @FunctionalInteface es opcional, pero es buena practica usarla.
        * Una interfaz funcional tiene solo un metodo abstracto.
        * Las expresiones lambas se utilizan para implementar el unico metodo abstracto de la interfaz.
     */

    public static void main(String[] args) {

         /*
         public void emitirMensaje (String nombre, int edad){
             System.out.println("Hola, desde Lambda - "+ nombre+"! ");
             System.out.println("Mi edad es: " + edad);
         }
         */

        //el metodo emitirMensaje , se implemento en la Lambda
        Mensajero lambdaMsj = (nombre,edad) -> {
            System.out.println("Hola, desde Lambda - "+ nombre+ "! "); //emitirMensaje
            System.out.println("Mi edad es: " + edad);
        };
        lambdaMsj.emitirMensaje("Benjamin", 25);



    }
}

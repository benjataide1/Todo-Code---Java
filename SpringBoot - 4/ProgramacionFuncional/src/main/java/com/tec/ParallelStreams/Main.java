package com.tec.ParallelStreams;

import java.util.Arrays;

public class Main {
    static void main() {

        /*

        * Streams que se pueden ejecutar en paralelo
         no se ejecuta todo paso por paso, sino que se ejecuta todo diviendo por nucleos o delegando tareas

         */

        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13};

        //? Stream secuencial (stream normal, paso por paso)

        long time = System.nanoTime();
        Arrays.stream(numbers).forEach(n -> System.out.println("Secuencial: " + n));
        long endTime = System.nanoTime();
        System.out.println("Tiempo secuencial: " + (endTime - time) / 1_000_000 + " ms");

        //? Parallel Stream (divide las tareas en nucleo, hilos)
        time = System.nanoTime();
        Arrays.stream(numbers).parallel().forEach(n -> System.out.println("Parallel: " + n));
        endTime = System.nanoTime();
        System.out.println("Tiempo paralelo: " + (endTime - time) / 1_000_000 + " ms");

    }
}

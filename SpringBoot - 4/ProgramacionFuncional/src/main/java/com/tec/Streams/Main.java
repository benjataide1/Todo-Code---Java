package com.tec.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {
    static void main() {
        /*
         * Stream es una secuencia de elementos sobre la que se pueden realizar operaciones.
            * No almacena los elementos, sino que los procesa de forma fluida y en tiempo real.
         * Se van ejecutando operaciones de forma secuencial.
         */

        List<String> names = new ArrayList<>();

        names.add("Juan");
        names.add("Pedro");
        names.add("Maria");
        names.add("Jose");
        names.add("Benjamin");
        names.add("Jazmin");

       names.stream().forEach(System.out::println);

      List<String> countries = Arrays.asList("Mexico","Canada","USA","Colombia","Argentina","Chile");

      countries.stream()
              .filter(country -> country.startsWith("C"))
              .map(String::toUpperCase)
              .forEach(System.out::println);

    }
}

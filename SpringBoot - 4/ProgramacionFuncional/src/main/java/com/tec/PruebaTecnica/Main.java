package com.tec.PruebaTecnica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Auto> listaAutos = Arrays.asList(
                new Auto(12000, "Volkswagen", "Golf"),
                new Auto(13000, "Volkswagen", "Jetta"),
                new Auto(11000, "Chevrolet", "Onix"),
                new Auto(14000, "Chevrolet", "Cruze"),
                new Auto(12500, "Fiat", "Cronos"),
                new Auto(11500, "Fiat", "Pulse"),
                new Auto(15000, "Toyota", "Corolla"),
                new Auto(13500, "Toyota", "Yaris"),
                new Auto(90000, "Renault", "Sandero"),
                new Auto(10000, "Nissan", "Versa")
        );



        // 1. Ordenar por precio de menor a mayor
        System.out.println("Ordenado por precio de Menor a mayor");
         List<Auto> autosPrecio = new ArrayList<Auto>(listaAutos);
         // sort: sirve para ordernar y es un metodo propio de la listas que sobreescribe la lista original
         // Comparator.comparting: es para comparar cada auto por su costo 'getCosto'
         autosPrecio.sort(Comparator.comparing(Auto::getCosto));
         autosPrecio.forEach(auto -> System.out.println(auto));
        System.out.println("------------------------------");

        // 2. Ordenar por marca y luego por precio usando sorted()
        System.out.println("Ordenado por marca y precio");
        //sorted: es un metodo de la API de Streams que no modifica la lista original, sino que devuelve una nueva lista ordenada
        listaAutos.stream()
                .sorted(Comparator.comparing(Auto::getCosto).thenComparing(Auto::getMarca))
                .forEach(System.out::println);
        System.out.println("------------------------------");

        // 3. Autos cuyo precio no supere los 23000
        System.out.println("Autos precio no supere los 23000");
        listaAutos.stream()
                .filter(auto -> auto.getCosto() <= 23000)
                .forEach(System.out::println);
        System.out.println("------------------------------");

        // 4. Autos de marca Chevrolet o Volkswagen
        System.out.println("Autos de marca Chevrolet o Volkswagen");
        listaAutos.stream()
                .filter(auto -> auto.getMarca().equalsIgnoreCase("Chevrolet") || auto.getMarca().equalsIgnoreCase("Volkswagen"))
                .forEach(System.out::println);
        System.out.println("------------------------------");



        // 5. Autos cuyo modelo contiene al menos una "a"
        System.out.println("Autos cuyo modelo contiene al menos una \"a\"");
        listaAutos.stream()
                .filter(auto -> auto.getModelo().toLowerCase().contains("a"))
                .forEach(System.out::println);
        System.out.println("------------------------------");


    }
}

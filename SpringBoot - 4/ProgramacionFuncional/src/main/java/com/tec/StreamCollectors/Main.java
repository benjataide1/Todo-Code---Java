package com.tec.StreamCollectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    static void main() {

        /*
        * Los Collectors son una herramienta de la API de Streams de Java
            Permite recolectar los resultados de un stream en una estructura final, como una lista,
            un conjunto, un mapa o incluso un solo valor (como un promedio).
        */

        //? Collectors.toList
        List<String> nombres = List.of("Juan", "Pedro", "Maria", "Ana");

        List<String> nombresConA = nombres.stream()
                .filter(n -> n.contains("a"))
                .collect(Collectors.toList());
        //filtramos los nombres que contienen la letra "a" y los recolectamos en una lista
        System.out.println("nombresConA = " + nombresConA);

        //? Collectors.toSet = convierte el resultado en un conjunto (Set) eliminando duplicados
        List<String> nombresDuplicados = List.of("JUAN", "Pedro", "MARIA", "ANA", "Juan", "Pedro");

        Set<String> nombresUnicos = nombresDuplicados.stream()
                .map(String::toUpperCase) //.map(n -> n.toUpperCase())
                .collect(Collectors.toSet());
        System.out.println("nombresUnicos = " + nombresUnicos);

        //? Collectors.joining() = podemos juntar los datos y nos permite elegir de que forma (separdos con , o no,etc)
        List<String> sgbds = List.of("MySQL", "Oracle", "PostgreSQL");

        String listaSgbds = sgbds.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(" | "));
        System.out.println("listaSgbds = " + listaSgbds);

        //? Collectors.counting() = nos permite contar los elementos de un stream
        List<String> countries = List.of("Argentina", "Brasil", "Chile", "Colombia", "Ecuador");

        Long count = countries.stream()
                .filter(c -> c.startsWith("C"))
                .collect(Collectors.counting());
        System.out.println("Paises con empieza con la Letra 'C' = " + count);


        //? Collectors.partitiongBy() = Hace particiones teniendo en cuenta una condicion boolean
        List<Integer> ages = List.of(15, 20, 34, 11, 12, 10, 54, 76, 58, 32, 25, 24, 8, 9, 6, 4);
        //Map<Valor de dato de retorno de la condicion, Lista de elementos que cumplen con la condicion>
        Map<Boolean, List<Integer>> mayoresDeEdad = ages.stream()
                .collect(Collectors.partitioningBy(age -> age >= 18));
        // [true: [20, 34, 54, 76, 58, 32, 25, 24], false: [15, 11, 12, 10, 8, 9, 6, 4]]
        System.out.println("mayoresDeEdad = " + mayoresDeEdad);
    }
}
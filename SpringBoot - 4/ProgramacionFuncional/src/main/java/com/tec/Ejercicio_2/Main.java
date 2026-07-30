package com.tec.Ejercicio_2;

import com.tec.Ejercicio_2.logic.Producto;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {

        // Lista de Productos
        List<Producto> productos = Arrays.asList(
                new Producto("Apple","Fruits",1,2.5),
                new Producto("Milk","lacteos",2,1.2),
                new Producto("Bread","barkery",5,1.0),
                new Producto("Yogurt","lacteos",3,1.5),
                new Producto("Pera","fruits",4,3.0),
                new Producto("Orange","fruits",4,3.0),
                new Producto("Chesse","lacteos",2,3.5),
                new Producto("Butter","lacteos",1,2.2),
                new Producto("Harina","barkery",3,1.5),
                new Producto("Arroz","alimentos",4,1.8),
                new Producto("Tomate","vegetables",5,1.2),
                new Producto("Lettuce","vegetables",2,0.9),
                new Producto("Fish","Fishing",1,4.0),
                new Producto("Pollo","carnes",3,5.0),
                new Producto("Carne","carnes",2,6.5)
        );

        //? 1. Filtrar productos de la categoria "fruits"
        System.out.println("Filtrado de Productos por categoria 'Fruits'");
        List<Producto> frutas = productos.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase("fruits"))
                .collect(Collectors.toList());

        frutas.forEach(System.out::println);

        //? 2. Calcular el precio total de los productos en "lacteos"
        System.out.println("\nPrecio total de productos en la categoria 'lacteos'");
        double totalLacteos = productos.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase("lacteos"))
                .mapToDouble(Producto::getPrecio)
                .sum();

        System.out.println("Total: " + totalLacteos);

        //? 3. Obtener el producto con el precio mas bajo
        System.out.println("\nProducto con el precio mas bajo");
        Producto precioBajo = productos.stream()
                .min(Comparator.comparingDouble(Producto::getPrecio))
                .orElse(null);

        System.out.println("Producto con el precio mas bajo: " + precioBajo);

        //? 4. Agrupar productos por categoria
        System.out.println("\nAgrupando productos por categoria");
        Map<String, List<Producto>> grupos = productos.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria));

       grupos.forEach((key, grupo) -> {
           System.out.println(key);
           grupo.forEach(System.out::println);
       });

        //? 5. Calcular el precio promedio de los productos por categoria
        System.out.println("\nPrecio promedio de los productos por categoria: " );
        Map<String, Double> promedios = productos.parallelStream()
                //.collect(String,Double)
                .collect(Collectors.groupingBy(Producto::getCategoria, Collectors.averagingDouble(Producto::getPrecio)));
        System.out.println(promedios);


        //? 6. Obtener la categoria con el precio promedio mas alto
        System.out.println("\nCategoria con el precio promedio mas alto");
        //entrySet() = quiere decir 'este set de valores ocupalos como entrada'
        String categoriaMax = promedios.entrySet().parallelStream()
                //Map <String, Double> = Map.Entry<String, Double>
                .max(Comparator.comparingDouble(Map.Entry::getValue)) // Map.Entry<String, Double> -> Double
                .map(Map.Entry::getKey) // Map.Entry<String, Double> -> String
                .orElse("no disponible");

        System.out.println("Categoria con el precio promedio mas alto: " + categoriaMax);

    }
}

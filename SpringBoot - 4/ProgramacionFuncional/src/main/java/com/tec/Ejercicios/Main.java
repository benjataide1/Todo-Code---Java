package com.tec.Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    static void main() {

        List<Cliente> listaClientes = getClientes();

        System.out.println("--------------");
        System.out.println("Ingrese el numero de cliente a enviar un paquete: ");
        Scanner sc = new Scanner(System.in);
        Long numeroCliente = sc.nextLong();

        Optional<Cliente> cliente = getClienteById(listaClientes, numeroCliente);
        //Verificar cliente
        if (cliente.isPresent()) { //si es true
            Optional<String> direccion = getAddress(cliente);
            //verificar si obtuvo o no,la direccion
            if (direccion.isPresent()) {
                System.out.println("La direccion del cliente es: " + direccion.get());
            } else {
                System.out.println("La direccion del cliente no tiene direccion");
            }
        } else {
            System.out.println("El cliente no existe");
        }


    }

    public static Optional<String> getAddress(Optional<Cliente> cliente) {
        return cliente
                .map(Cliente::getDireccion);

    }

    //Optional<Cliente> es un contenedor que puede o no contener un valor no nulo
    public static Optional<Cliente> getClienteById(List<Cliente> listaClientes, Long id) {
        return listaClientes.stream()
                .filter(cliente -> cliente.getNroId().equals(id)) //Al ser long se usa equals y no ==
                .findFirst(); //Devolve el primero que cumpla la condicion

    }

    public static List<Cliente> getClientes() {
        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente(1L, "Juan", "Perez", "Calle 1", "111111111"));
        clientes.add(new Cliente(2L, "Maria", "Gomez", "Calle 2", "222222222"));
        clientes.add(new Cliente(3L, "Luis", "Lopez", null, "333333333"));
        clientes.add(new Cliente(4L, "Ana", "Martinez", "Calle 4", "444444444"));
        clientes.add(new Cliente(5L, "Carlos", "Ramirez", "Calle 5", "555555555"));
        clientes.add(new Cliente(6L, "Sofia", "Torres", null, "666666666"));
        clientes.add(new Cliente(7L, "Pedro", "Diaz", "Calle 7", "777777777"));
        clientes.add(new Cliente(8L, "Lucia", "Vargas", "Calle 8", "888888888"));
        clientes.add(new Cliente(9L, "Diego", "Mendoza", null, "999999999"));
        clientes.add(new Cliente(10L, "Elena", "Castro", "Calle 10", "101010101"));

        return clientes;
    }
}

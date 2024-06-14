package Exercise;

import java.awt.*;
import java.util.Scanner;

public class Matriz_Vuelos_6 {
    public static void main(String[] args) {
        int asientos[][] = new int[6][3];


        Scanner keyboard = new Scanner(System.in);


        for (var row = 0; 0 < 6; row++) {
            System.out.println(" ");
            for (int colum = 0; colum <= 3; colum++) {
                System.out.println("Por favor Cargue la cantidad de Asientos, En la Fial: " + row + " , Posicion: " + colum);
                asientos[row][colum] = keyboard.nextInt();

            }
        }


        Scanner keyboard2 = new Scanner(System.in);

        String bandera = "";
        int destino, horario, lugares;

        while (!bandera.equalsIgnoreCase("finish")) {
            System.out.println("Ingrese el Num de Destino:");
            destino = keyboard.nextInt();
            System.out.println("Ingrese el Num de Horario:");
            horario = keyboard.nextInt();
            System.out.println("Ingrese la Cantidad de Asientos: ");
            lugares = keyboard.nextInt();

            if (asientos[destino][horario] >= lugares) {
                System.out.println("Su reserva fue Realizada con Exito");
                asientos[destino][horario] -= lugares;
            } else {
                System.out.println("No Hay asientos Disponibles");
            }

            System.out.println("Desea continuar reservando?, Ingrese finish si quiere terminar:");
            bandera = keyboard2.nextLine();
        }

    }
}

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {


        //Declaracion

        int matriz[][] = new int[3][2];

        Scanner keyboard = new Scanner(System.in);

        //Asignacion Manual
//
//        matriz[0][0] = 23;
//        matriz[0][1] = 27;
//
//        matriz[1][0] = 78;
//        matriz[1][1] = 8983;
//
//        matriz[2][0] = 98;
//        matriz[2][1] = 1000;


        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.println("Enter te value fila: " + fila + ", columna: " + columna);
                matriz[fila][columna] = keyboard.nextInt();
            }
        }

        System.out.println("-".repeat(50));


        //Recorrido

        for (int fila = 0; fila < matriz.length; fila++) {
            System.out.println("Estoy en la fila: " + fila);

            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.println("Esoy en la columna: " + columna);
                System.out.println("Estoy en la fila: " + fila + ", Columna: " + columna);
                System.out.println("El valor es: " + matriz[fila][columna]);
            }

            System.out.println("-".repeat(15));
        }
    }
}

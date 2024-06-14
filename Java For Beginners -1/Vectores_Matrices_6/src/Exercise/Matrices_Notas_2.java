package Exercise;


import java.util.Scanner;

public class Matrices_Notas_2 {
    public static void main(String[] args) {
        double notas[][] = new double[4][4];
        double total = 0;
        Scanner keyboard = new Scanner(System.in);

        for (int row = 0; row < notas.length; row++) {

            for (int colum = 0; colum < notas[row].length; colum++) {

                if (colum == 3) {
                    total /= notas[row].length;
                    notas[row][colum] = total;
                } else {
                    System.out.println("Enter the Note in the row " + row + " colum " + colum + ", :");
                    notas[row][colum] = keyboard.nextInt();
                    total += notas[row][colum];
                }

            }

        }


        System.out.println("The average of alumns are: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("The Alumn in the posicion: " + i + " ,is : " + Math.round(notas[i][3]));
            System.out.println("-".repeat(50));

        }

    }
}

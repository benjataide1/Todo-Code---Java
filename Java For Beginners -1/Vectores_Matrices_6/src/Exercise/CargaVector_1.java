package Exercise;

import java.util.Scanner;

public class CargaVector_1 {
    public static void main(String[] args) {
        int vector[] = new int[15];
        int count = 0;
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Enter a Number, In the posicion " + i);
            vector[i] = keyboard.nextInt();
            if (vector[i] == 3) {
                count++;
            }
        }

        System.out.println("There are : " + count + " - 3 - Numbers in the vector");
    }
}

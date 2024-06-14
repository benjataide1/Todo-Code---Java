package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class CargaNombres_Vector_3 {
    public static void main(String[] args) {

        String names[] = new String[8];

        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter a Name, In the posicion: " + i);
            names[i] = keyboard.nextLine();
            System.out.println("");
        }

        for (String name : names) {
            System.out.println(name);
        }

        Arrays.stream(names).forEach((item) -> {
            System.out.println(item);
        });
    }
}

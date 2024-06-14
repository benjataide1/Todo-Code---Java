import java.util.Arrays;
import java.util.Scanner;

public class Vectores_Arrays {
    public static void main(String[] args) {

        //Declaracion
        int array[] = new int[2];

        //Asignacion Manual
        array[0] = 10;
        array[1] = 43;

        System.out.println(array[1]);
        System.out.println(array.length);


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //Scanner

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the large of String: ");
        int large = keyboard.nextInt();

        String arrayNames[] = new String[large];

        for (int i = 0; i < arrayNames.length; i++) {
            System.out.println("Enter the value for the posicion: " + i);
            String names = keyboard.nextLine();
            arrayNames[i] = names;
            System.out.println("-".repeat(10));
        }

        Arrays.stream(arrayNames).forEach((String i) -> {
            System.out.println(i);
        });

    }
}

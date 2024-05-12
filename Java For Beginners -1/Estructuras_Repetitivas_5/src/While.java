import java.util.Scanner;

public class While {
    public static void main(String[] args) {


        //! Controlado por Contador

        int count = 10;

        while (count >= 0) {
            System.out.println("I am : " + count);
            count -= 1;
        }


        //! Controlado por Centinela

        var age = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese un Numero: ");

        age = keyboard.nextInt();

        while (age <= 20) {
            System.out.println("Ingresa un Numero: ");
            age = keyboard.nextInt();
        }


        //! Bucle Infinito

        boolean centi = true;
        while (centi) {
            System.out.println("Infinitive = " + centi);

        }

//        int num = 4;
//
//        num = num == 4 ? 5 : 3;

    }
}

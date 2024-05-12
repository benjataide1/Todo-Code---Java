import java.util.Scanner;

public class Inscripciones_Exercise_3 {
    public static void main(String[] args) {

        Scanner ageP = new Scanner(System.in);
        Scanner nameDni = new Scanner(System.in);

        //DNI
        System.out.println("Ingrese el DNI: ");
        String dni = nameDni.nextLine();

        //NAME
        System.out.println("Ingrese su Name: ");
        String name = nameDni.nextLine();


        //AGE
        System.out.println("Ingrese su edad: ");
        int age = ageP.nextInt();



        // dni !=0  falso, name != fin , true
        // ? Ojo con la logica de las tablas
        while (!dni.equalsIgnoreCase("0") && !name.equalsIgnoreCase("fin")) {

            if (age >= 6 && age <= 10) {
                System.out.println("Menores A");
            } else if (age >= 11 && age <= 17) {
                System.out.println("Menores B");
            } else if (age >= 18 && age <= 30) {
                System.out.println("Juveniles");
            } else if (age >= 31 && age <= 50) {
                System.out.println("Adultos");
            } else if (age > 50) {
                System.out.println("Adultos Mayores");
            }

            System.out.println("ingrese el dni: ");
            dni = nameDni.nextLine();

            System.out.println("ingrese su name: ");
            name = nameDni.nextLine();

            System.out.println("ingrese su edad: ");
            age = ageP.nextInt();


        }

    }

}




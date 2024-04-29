import java.util.Scanner;

public class Condicional_Ternario {
    public static void main(String[] args) {


        double promedio;
        String confitionFinal;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el Promedio: ");
        promedio = keyboard.nextDouble();

        confitionFinal = promedio >= 6 ? "Aprobado" : "Desaprobado";

        System.out.println("Nota final: " + confitionFinal);


    }
}

import java.util.Scanner;

public class Palabras_Exercise_2 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the Letter");

        String letter = keyboard.nextLine();

        while (!letter.equalsIgnoreCase("salir")) { //! En java para comparar Strings usamos el 'equals',tambien ignormaos minusculas y mayusculas

            System.out.println("You Letter is !" + letter);

            System.out.println("Enter the new Letter: ");

            letter = keyboard.nextLine();

        }


    }
}

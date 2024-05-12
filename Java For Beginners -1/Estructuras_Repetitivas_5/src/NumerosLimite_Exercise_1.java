import java.util.Scanner;

public class NumerosLimite_Exercise_1 {
    public static void main(String[] args) {


        Scanner num = new Scanner(System.in);
        System.out.println("Enter the Limit: ");
        int limit = num.nextInt();
        var count = 1;

        while (count <= limit) {
            System.out.println(count);
            count++;
        }


        do {
            System.out.println("Soy el do While");
            System.out.println("La condicion no se cumple,pero se ejecuta una 1 vez");
        } while (10 < count);


    }
}

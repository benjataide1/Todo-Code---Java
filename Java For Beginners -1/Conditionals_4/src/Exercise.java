import java.util.*;

public class Exercise {

    public static void main(String[] args) {
        String puesto = "";
        int categoria;
        double sueldo = 0;

        System.out.println("--- Enter the type of category ---");
        Scanner keyboard = new Scanner(System.in);
        categoria = keyboard.nextInt();


        switch (categoria) {
            case 1:
                sueldo = 15.890 + (15.890 * 0.10);
                puesto = "repositor";
                break;
            case 2:
                sueldo = 25630.89;
                puesto = "cajero";
                break;
            case 3:
                sueldo = 25560.20 - (25560.20 * 0.11);
                puesto = "supervisor";
                break;
            default:
                if (categoria == 0 || categoria >= 4) {
                    System.out.println("Happend Error");
                }
        }

        System.out.println("El " + puesto + ", tiene un sueldo de: " + sueldo);

    }
}

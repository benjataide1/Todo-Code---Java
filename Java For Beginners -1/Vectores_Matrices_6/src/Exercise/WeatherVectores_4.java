package Exercise;

import java.awt.*;
import java.util.Scanner;

public class WeatherVectores_4 {
    public static void main(String[] args) {
        String citys[] = new String[5];
        double min[] = new double[5];
        double max[] = new double[5];

        Scanner keyboard = new Scanner(System.in);
        Scanner nums = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the city Name: ");
            citys[i] = keyboard.nextLine();
            System.out.println("-".repeat(20));

            System.out.println("Enter the lowest temperature: ");
            min[i] = nums.nextDouble();
            System.out.println("-".repeat(20));

            System.out.println("Enter the maximum temperature: ");
            max[i] = nums.nextDouble();
            System.out.println("-".repeat(20));
        }

        double baja = min[0];
        double alta = max[0];
        int cityMin = 0;
        int cityMax = 0;

        for (int i = 0; i < 5; i++) {

            if (baja > min[i]) {
                baja = min[i];
                cityMin = i;
            }
        }

        for (int i = 0; i < 5; i++) {
            if (alta < max[i]) {
                alta = max[i];
                cityMax = i;
            }
        }

        System.out.println("La Ciudad " + citys[cityMin] + " Tiene la temperatura minima de : " + baja);
        System.out.println("La Ciudad " + citys[cityMax] + " Tiene la temperatura maxima de : " + alta);
    }

}

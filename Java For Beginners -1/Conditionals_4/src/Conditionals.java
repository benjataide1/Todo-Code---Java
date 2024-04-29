public class Conditionals {
    public static void main(String[] args) {


        var num1 = 10;
        int num2 = 10;
        System.out.println(num2 + (num2 * 0.10));

        if (num2 > num1) {
            System.out.println("The num2 is mayor than num1 ");
        } else if (num2 < num1) {
            System.out.println("El num2 es menor que el num1");
        } else {
            if (num1 == num2) {
                System.out.println("Son iguales");
            } else {
                System.out.println("Ocurrio un Error");
            }
        }

    }
}
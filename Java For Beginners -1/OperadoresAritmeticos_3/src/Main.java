public class Main {
    public static void main(String[] args) {

        int num1, num2, result;
        num1 = 4;
        num2 = 10;


        result = num2 % num1;

        System.out.println(num2 + num1);
        System.out.println(num2 - num1);
        System.out.println(num2 * num1);
        System.out.println(Math.pow(num2, num1));

        System.out.println("result = " + result);


        //!Changes the values
        int a = 35;
        int b = 20;
        int x;

        System.out.println("Before, a = " + a + ", b = " + b);

        //x = 20
        x = b;
        //b = 35
        b = a;
        //a = 20
        a = x;

        System.out.println("After, a = " + a + ", b = " + b);

    }
}
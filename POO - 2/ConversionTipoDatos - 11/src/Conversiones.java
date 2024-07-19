public class Conversiones {
    public static void main(String[] args) {

        //? Datos Primitivos --> Empiezan con minuscula (int, double, etc)
        //? Clases Contenedoras (Clases Wrapper) --> Empizan con Mayuscula (String, Integer, etc)
        double num = 1.75;

        //! Casteo a entero
        int entero = (int) num;


        //! Casteo a long
        long numLong = (long) num;

        System.out.println("double: " + num);
        System.out.println("int: " + entero);
        System.out.println("long: " + numLong);


        //! Clases Contenedores
        String amount = "15";
        String price = "170.25";

        int cantidad = Integer.parseInt(amount);
        double priceDouble = Double.parseDouble(price);

        System.out.println("total: " + (priceDouble + cantidad));

        //! Convertir a String

        int age = 22;
        double height = 1.67;

        String edad = String.valueOf(age);
        String estatura = String.valueOf(height);

        System.out.println("Age: " + edad + " Height: " + estatura);

    }
}

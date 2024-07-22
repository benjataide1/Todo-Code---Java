package exemptions;

public class Exemptions {
    public static void main(String[] args) {
        int[] ages = null;
        try {
//            int result = 3 / 0;

            ages = new int[]{2, 4, 5, 1234};

        } catch (Exception e) {
//            System.out.println("No se puede dividir por zeroooo!!!");
            System.out.println("La posicion 4 es: " + ages[4]);
        }finally {
            System.out.println("Yo siempre me ejecuto");
        }

    }
}

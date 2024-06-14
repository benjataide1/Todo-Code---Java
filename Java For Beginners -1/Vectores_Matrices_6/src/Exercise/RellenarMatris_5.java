package Exercise;

public class RellenarMatris_5 {
    public static void main(String[] args) {
        int matriz[][] = new int[4][5];


        for (int row = 0; row < 4; row++) {

            for (int colum = 0; colum < matriz[row].length; colum++) {
                    matriz[row][colum] = 5;
            }

        }

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int colum = 0; colum < matriz[row].length; colum++) {
                System.out.print(matriz[row][colum] + " ");
            }

        }


    }
}

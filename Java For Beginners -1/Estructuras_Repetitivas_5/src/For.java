import java.util.Arrays;
import java.util.List;

public class For {
    public static void main(String[] args) {

        String array[] = {"1","pepe","Hello","world"};

        for (var i = 0; i <= 10; i++) {
            System.out.println("For,count = " + i);
        }

        //! ForEach
        for (String item : array) {
            System.out.println(item);
        }

        //! Lambda
        //Converito mi array antigo a una coleccion,podria directamente crear un ArrayList o una List
        Arrays.stream(array).forEach((n) -> {
            System.out.println(n);
        });


    }
}
package testHashMap;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {

        //!  "<Key, Value>"
        Map<Integer, String> mapa = new HashMap<>();


        //! Agrego valores
        mapa.put(1, "Juan");
        mapa.put(2, "Pedro");
        mapa.put(3, "Jorge");
        mapa.put(4, "Lucho");
        mapa.put(5, "Jazmin");


        //! Consulto si mi HasMap contiene x valor
        boolean contiene = mapa.containsValue("pedro");
        System.out.println("El valor buscado es :" + contiene);

        //! Obtener todos los valores
        System.out.println("Los valores son : " + mapa.values());

        //! Get value for key
        var name = mapa.get(2);
        System.out.println("The Employee is: " + name);

        //! Delete for Key
        mapa.remove(4);
    }
}

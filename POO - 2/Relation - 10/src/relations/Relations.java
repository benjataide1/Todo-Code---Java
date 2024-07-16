package relations;


import java.util.*;

public class Relations {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.setId(1L);
        auto.setBrand("Fiat");
        auto.setModel("Fitito");


        //* Creo la Lista
        List<Propietario> propietarioList = new ArrayList<Propietario>();

        //* Creo Obj tipos Propietario
        Propietario prop1 = new Propietario(35L, "Pedro", "Uriel");
        Propietario prop2 = new Propietario(23L, "Jazmin", "Valdivia");

        //* Agrego mis Obj tipos Propietarios a mi List
        propietarioList.add(prop1);
        propietarioList.add(prop2);

        //* Agrego mi List a Obj Auto
        auto.setProp(propietarioList);

        //* Muesto todo
        System.out.println(auto.toString() + " ," + auto.getProp());


    }
}

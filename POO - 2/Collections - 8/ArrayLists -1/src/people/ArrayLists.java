package people;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {

        //! Declaro entre " < > " , el tipo de dato que voy a aguardar
        List<Personas> list = new ArrayList<Personas>();

        //! Agregamos con "add"
        list.add(new Personas(1, "Benjamin", 22));
        list.add(new Personas(2, "Jazmin", 21));
        list.add(new Personas(3, "Ferid", 8));
        list.add(new Personas(4, "Cane", 4));
        list.add(new Personas(5, "Lucia", 2));

        //! Recorremos la List , ForEach , Lambda

        System.out.println("- ".repeat(10) + "Lambda" + " -".repeat(10));

        list.forEach(persona -> {
            System.out.println("Persona: " + persona.getName());
        });

        System.out.println("- ".repeat(10) + "ForEach" + " -".repeat(10));

        for (Personas persona : list) {
            System.out.println("Persona: " + persona.getName());
        }

    }
}

package linked_array;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linked_ArrayList {
    public static void main(String[] args) {

        List<Personas> array = new ArrayList<>();
        array.add(new Personas(1, "Juancito", 24));
        array.add(new Personas(2, "Pedro", 23));
        array.add(new Personas(3, "Martina", 16));
        array.add(new Personas(4, "Mateo", 2));
        array.add(new Personas(5, "Ignacio", 3));


        List<Personas> list = new ArrayList<>();
        list.add(new Personas(1, "Benjamin", 22));
        list.add(new Personas(2, "Jazmin", 21));
        list.add(new Personas(3, "Ferid", 8));
        list.add(new Personas(4, "Cane", 4));
        list.add(new Personas(5, "Lucia", 2));


        //* Remove en ArrayList
        array.remove(1);

        //* Remove en LinkedList
        for (Personas e : list) {
            if (e.getName().equalsIgnoreCase("Lucia")) {
                list.remove(e);
                break;
            }
        }


        System.out.println("-".repeat(15) + " DELETE" + "-".repeat(15));

        System.out.println("-".repeat(10) + " ARRAYLIST " + "-".repeat(10));

        for (Personas e : array) {
            System.out.println(e.getName());
        }


        System.out.println("-".repeat(10) + " LINKEDLIST " + "-".repeat(10));

        list.forEach((Personas e) -> {
            System.out.println(e.getName());
        });

        //* Size List
        System.out.println("-".repeat(10) + "WHAT IS THE SIZE OF MY LIST?" + "-".repeat(10));
        System.out.println("ArrayList: " + array.size());
        System.out.println("LinkdList: " + list.size());

        //* Get the first Obj
        System.out.println("-".repeat(10) + "FIRST AND LAST OBJECT" + "-".repeat(10));

        System.out.println("First LinkedList: " + list.getFirst().toString());
        System.out.println("Last LinkedList: " + list.getLast().toString());


        //* Delete all list
        System.out.println("-".repeat(10) + " DELETE LIST / ARRAY " + "-".repeat(10));
        array.clear();
        list.clear();

        //* Chekc is Empty
        System.out.println("-".repeat(10) + " The list is empty? " + "-".repeat(10));
        System.out.println("ArrayList: " + array.isEmpty());
        System.out.println("LinkedList: " + list.isEmpty());


    }


}

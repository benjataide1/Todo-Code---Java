package pilas;


import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

        //! Declaro mi stack con el tipo de dato que tiene que aceptar
        Stack<Integer> pila = new Stack<Integer>();

        System.out.println("List empty: " + pila);
        System.out.println("Is empty: " + pila.isEmpty());


        //? Add

        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);


        //? Recorro
        for (int i : pila) {
            System.out.println(i);
        }

        //? Show
        System.out.println("Stack: " + pila);
        System.out.println("Stack empty?: " + pila.isEmpty());


        pila.pop(); //? elimina el ultimo registro que entro
        System.out.println("Esta el 3? " + pila.search(3));
        System.out.println("Last register: " + pila.peek());
    }
}

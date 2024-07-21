import logic.Box;

public class Main {
    public static void main(String[] args) {

        //! Le digo que mi Box va a recibir  Tipo De Dato "<String>"
        Box<String> box = new Box<>();

        box.putSomething("Hello-World");
        System.out.println(box.getSomething());


        Box<Integer> boxNum = new Box<Integer>();
        boxNum.putSomething(23);
        System.out.println(boxNum.getSomething());
    }
}

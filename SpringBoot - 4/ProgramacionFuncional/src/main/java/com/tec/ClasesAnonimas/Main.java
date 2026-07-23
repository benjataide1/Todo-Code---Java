package com.tec.ClasesAnonimas;

public class Main {
    /**
    * Una clase anonima es una clase que se define y se usa al mismo tiempo, sin darle un nombre.
    * Se utiliza cuando neceistas una clase qeu solo se va a usar una vez, como para sobreescribir un metodo de una clase abstracta o una interfaz,
     * sin tener que crear una clase completa.
    */
    public static void main() {

        //! Java sabe que perro implementa la interfaz y una clase anonima
        Animal perro = new Animal() {
            @Override
            public void emitirSonido() {
                System.out.println("El perro ladra");
            }
        };

        perro.emitirSonido();

        //!Puedo usar una clase vacia y darle la forma que quiero con la clase anonima
        new Vehiculo(){
            private int numPass;

            public void manjear(){
                System.out.println("Estoy manejando");
            }
        }.manjear(); //llamo al metodo, de mi clase/objeto anonimo



    }
}

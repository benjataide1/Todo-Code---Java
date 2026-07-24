package com.tec.LambasvsClaseAnonimas;

public class Main {
    static void main() {


        //resuleto con clases anonimas
         Operador suma = new Operador() {
             @Override
             public int operar(int a,int b) {
                 return a+b;
             }
         };

        System.out.println("Suma Anonima: "+ suma.operar(5,3));


        //resulesto con lambdas
        Operador suma2 = (a,b) -> a + b;
        System.out.println("Suma Lambda: "+ suma2.operar(8,3));
    }
}

package inheritance;

public class Polimorfismo_Test {
    public static void main(String[] args) {

       Persona personas[] = new Persona[5];

       //! All are type of Persona
       personas[0] = new Persona();
       personas[1] = new Employee();
       personas[2] = new Consultant();
       personas[3] = new Boss();


       //! Consultor es una persona

       Persona persona = new Persona();
       Consultant consultant = new Consultant();
//     Persona consultant = new Consultant();

       persona = consultant;

    }
}
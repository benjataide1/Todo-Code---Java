package testEnum;

public class TestEnum {

    //! First letter of my class with Capitla Letter
    enum Colors {

        //! Cada uno de mis ENUMS tiene un valor (String)
        RED("rojo"), BLUE("azul"), GREEN("verde"), YELLOW("Amarillo"), ORANGE("Naranja"), BLACK("Negro"), WHITE("Blanco");

        private final String descripcion; //! Esta variable representa cada valor de mis enums

        //! Constructor de mi ENUM
        private Colors(String descripcion) {
            this.descripcion = descripcion;  //! Asigno ese valor amis enums
        }

    }

    public static void main(String[] args) {

        //! Guarde en mi variable 'colors' el valor del enum "BLUE"
        Colors colors = Colors.BLUE;

        System.out.println("colors = " + colors);

        //! Recorro mi ENUM y muestro sus valores
        for (Colors c : Colors.values()) {
            System.out.println(c);
        }

    }
}

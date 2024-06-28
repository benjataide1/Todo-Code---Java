public class Alumno {

    //* Atributes

    int id;
    String name;
    String lastname;


    //* Constructor

    public Alumno() {
    }

    public Alumno(int id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }

    
    //* Get and Setter

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    //* Mehotds

    public void showName() {
        System.out.println("I'm a studen and i can say my name");
    }

    public void knowAprobado(double num) {
        if (num >= 6) {
            System.out.println("Approved");
        } else {
            System.out.println("not approved");
        }

    }


}

public class Test_POO {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();

        Alumno alumno1 = new Alumno(5, "Jazmin", "Valdivia");

        //! alumno1
        System.out.println("Id alumno1: " + alumno1.getId());
        System.out.println("Name alumno1: = " + alumno1.getName());
        System.out.println("Lastname alumno1: = " + alumno1.getLastname());

        System.out.println("-".repeat(40));

        //! alumno
        alumno.setId(8);
        alumno.setName("Juan");
        alumno.setLastname("Dominguez");
        System.out.println("Id alumno: " + alumno.getId());
        System.out.println("Name alumno: = " + alumno.getName());
        System.out.println("Lastname alumno: = " + alumno.getLastname());

        System.out.println("-".repeat(40));

        //! chance values
        alumno1.setId(47);
        System.out.println(alumno1.getId());

    }


}

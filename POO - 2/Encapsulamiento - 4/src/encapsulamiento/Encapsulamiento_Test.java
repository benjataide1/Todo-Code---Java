package encapsulamiento;

public class Encapsulamiento_Test {

    public static void main(String[] args) {

        Student student = new Student();
        Student student1 = new Student(1, "Benja", "Perez");

        //! Is getId -> is private
//        System.out.println("Id: " + student1.getId());
        System.out.println("name: " + student1.getName());
        System.out.println("Lastname: " + student1.getLast_name());


    }
}

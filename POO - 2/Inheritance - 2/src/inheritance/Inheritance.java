package inheritance;

public class Inheritance {
    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.getLast_name();
        employee.getNum_legajo();

        System.out.println("-".repeat(30));

        Consultant consultant = new Consultant();

        consultant.getId();
        consultant.getName_consultant();


    }
}
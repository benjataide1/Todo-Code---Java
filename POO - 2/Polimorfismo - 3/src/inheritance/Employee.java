package inheritance;

public class Employee extends Persona {

    int num_legajo;
    String carg;
    Double salary;

    public Employee() {
    }

    public Employee(int id, String dni, String name, String last_name, String address, String phone, int num_legajo, String carg, Double salary) {
        super(id, dni, name, last_name, address, phone); //! With super we call the constructor of my super clas(inheritance.Persona)
        this.num_legajo = num_legajo;
        this.carg = carg;
        this.salary = salary;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getCarg() {
        return this.carg;
    }

    public void setCarg(String carg) {
        this.carg = carg;
    }

    public int getNum_legajo() {
        return this.num_legajo;
    }

    public void setNum_legajo(int num_legajo) {
        this.num_legajo = num_legajo;
    }
}
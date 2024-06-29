package inheritance;

public class Persona {


    int id;
    String dni;
    String name;
    String last_name;
    String address;
    String phone;

    public Persona() {
    }

    public Persona(int id, String dni, String name, String last_name, String address, String phone) {
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.last_name = last_name;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

package logic;

import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) //! TABLE_PER_CLASS -> hace que mi Clase Persona no Persistencia en mi BD
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //! Las clases Hijas van a tener su propio atributo y ID pero van a implementar la misma estrategia "IDENTITY"
    private int id_person;

    @Basic
    private String  dni;
    private String first_name;
    private String last_name;
    private String phone;
    private String address;

    @Temporal(TemporalType.DATE)
    private Date date;

    public Person() {
    }

    public Person(String dni, String first_name, String last_name, String phone, String address, Date date) {
        this.dni = dni;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone = phone;
        this.address = address;
        this.date = date;
    }


    public int getId_person() {
        return id_person;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}

package org.jpa.logic;


import javax.persistence.*;
import java.util.Date;


@Entity //! --> Declaro que esta Clase va a hacer una Entity / Tabla
public class Student {

    //! Declaro que es mi Primary Key y que se auto incrementa
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //! Campo Basic
    @Basic
    private String name;
    private String lastname;

    //! Campo DATE
    @Temporal(TemporalType.DATE)
    private Date dateBirth;

    @OneToOne
    private Carrer carrer;

    public Student() {
    }


    //! NO hago el id por que se AutoIncrementa
    public Student(Carrer carrer, Date dateBirth, String lastname, String name) {
        this.carrer = carrer;
        this.dateBirth = dateBirth;
        this.lastname = lastname;
        this.name = name;
    }

    public Carrer getCarrer() {
        return this.carrer;
    }

    public void setCarrer(Carrer carrer) {
        this.carrer = carrer;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("carrer=").append(carrer.toString());
        sb.append(", id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", lastname='").append(lastname).append('\'');
        sb.append(", dateBirth=").append(dateBirth);
        sb.append('}');
        return sb.toString();
    }
}

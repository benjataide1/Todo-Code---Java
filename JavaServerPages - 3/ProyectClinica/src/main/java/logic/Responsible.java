package logic;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Responsible extends Person {

//    private int id_responsible;
    private String type_responsible;


    public Responsible(String dni, String first_name, String last_name, String phone, String address, Date date, String type_responsible) {
        super(dni, first_name, last_name, phone, address, date);
        this.type_responsible = type_responsible;
    }

    public Responsible() {

    }

    public String getType_responsible() {
        return type_responsible;
    }

    public void setType_responsible(String type_responsible) {
        this.type_responsible = type_responsible;
    }
}

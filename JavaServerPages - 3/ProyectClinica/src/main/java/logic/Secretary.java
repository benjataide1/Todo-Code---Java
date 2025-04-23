package logic;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Date;
import logic.Patient;

@Entity
public class Secretary extends Person {

//    private int id_secretary;
    private String sector;
    @OneToOne
    private User user;


    public Secretary(String dni, String first_name, String last_name, String phone, String address, Date date, String sector, User user) {
        super(dni, first_name, last_name, phone, address, date);
        this.sector = sector;
        this.user = user;
    }

    public Secretary() {

    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

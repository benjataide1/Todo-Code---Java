package logic;

import javax.persistence.*;
import java.util.Date;

@Entity
public class User extends Person {

    @Basic
    private String name_user;
    private String password_user;
    private String role_user;


    public User(String dni, String first_name, String last_name, String phone, String address, Date date, String name_user, String password_user, String role_user) {
        super(dni, first_name, last_name, phone, address, date);
        this.name_user = name_user;
        this.password_user = password_user;
        this.role_user = role_user;
    }

    public User() {
        super();
    }

    public String getName_user() {
        return name_user;
    }

    public void setName_user(String name_user) {
        this.name_user = name_user;
    }

    public String getPassword_user() {
        return password_user;
    }

    public void setPassword_user(String password_user) {
        this.password_user = password_user;
    }

    public String getRole_user() {
        return role_user;
    }

    public void setRole_user(String role_user) {
        this.role_user = role_user;
    }
}

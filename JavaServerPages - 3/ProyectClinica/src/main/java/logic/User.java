package logic;

public class User {
    private int id_user;
    private String name_user;
    private String password_user;
    private String role_user;


    public User(String name_user, String password_user, String role_user) {
        this.name_user = name_user;
        this.password_user = password_user;
        this.role_user = role_user;
    }

    public int getId_user() {
        return id_user;
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

package logic;

import controller.ControllerPersistence;

import java.util.List;

public class Controladora {


    ControllerPersistence control = new ControllerPersistence();

    public void createUser(User user) {
        control.createUser(user);
    }

    public List<User> listUser() {
        return control.listUser();
    }
}

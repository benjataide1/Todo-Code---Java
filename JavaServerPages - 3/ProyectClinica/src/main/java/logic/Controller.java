package logic;

import persistence.ControllerPersistence;

public class Controller {

    ControllerPersistence controllerPersistence = new ControllerPersistence();

    public void createUser(String name, String password, String rol) {

        User user = new User(name,password,rol);

        controllerPersistence.createUser(user);
    }

}

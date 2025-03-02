package logic;

import persistence.ControllerPersistence;
import persistence.UserJpaController;
import java.util.List;

public class Controller {
    ControllerPersistence controllerPersistence = new ControllerPersistence();

    public void creaUser(User user) {
        controllerPersistence.createUser(user);
    }


    public List<User> getUsers() {
        return controllerPersistence.getUsers();
    }
}

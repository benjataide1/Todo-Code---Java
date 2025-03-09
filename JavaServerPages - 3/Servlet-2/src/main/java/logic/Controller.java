package logic;

import persistence.ControllerPersistence;
import java.util.List;

public class Controller {
    ControllerPersistence controllerPersistence = new ControllerPersistence();

    public void creaUser(User user) {
        controllerPersistence.createUser(user);
    }


    public List<User> getUsers() {
        return controllerPersistence.getUsers();
    }

    public void deleteUser(int id){
        controllerPersistence.deleteUser(id);
    }

    public User getUser(int idUpdate) {
        return controllerPersistence.getUser(idUpdate);
    }

    public void updateUser(User user) {
        try {
            controllerPersistence.updateUser(user);
        } catch (Exception e) {
        e.getMessage();
        e.getLocalizedMessage();
        e.printStackTrace();
        }
    }
}

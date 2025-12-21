package logic;

import persistence.ControllerPersistence;

import java.util.List;

public class Controller {

    ControllerPersistence controllerPersistence = new ControllerPersistence();

    //? User

    public void createUser(String name, String password, String rol) {

        User user = new User(name,password,rol);

        controllerPersistence.createUser(user);
    }

    public List<User> getUsers(){
        return controllerPersistence.getUsers();
    }

    public void deleteUser(int id){
        controllerPersistence.deleteUser(id);
    }

    public User findUser(int id){
        return controllerPersistence.findUser(id);
    }

    public void updateUser(User user){
        controllerPersistence.updateUser(user);
    }
}

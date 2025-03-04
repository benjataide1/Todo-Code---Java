package persistence;
import logic.User;

import java.util.List;

public class ControllerPersistence {
    UserJpaController usuJpa = new UserJpaController();


    //! GET
    public void createUser(User user){
        usuJpa.create(user);
    }

    //! READ
    public List<User> getUsers(){
        return usuJpa.findUserEntities();
    }

    //! DELETE
    public void deleteUser(int id){
        usuJpa.destroy(id);
    }
}

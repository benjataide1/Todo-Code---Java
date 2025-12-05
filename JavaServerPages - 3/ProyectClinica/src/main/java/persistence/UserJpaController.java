package persistence;

import logic.User;


public class UserJpaController extends GenericJpaDAO<User, Integer> {

    public UserJpaController() {
        super(User.class);
    }

}
package controller;

import logic.User;

import java.util.List;

public class ControllerPersistence {

    UserJpaController usuJPA = new UserJpaController();

    // CREATE
    public void createUser(User user){
        usuJPA.create(user);
    }


    // READ
    public List<User> listUser(){
        return usuJPA.findUserEntities();
    }






}

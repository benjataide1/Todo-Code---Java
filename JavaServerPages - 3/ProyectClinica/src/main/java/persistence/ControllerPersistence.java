package persistence;

import logic.User;

import java.util.List;

public class ControllerPersistence {

    OdontologoJpaController odontologoJpaController = new OdontologoJpaController();
    PatientJpaController patientJpaController = new PatientJpaController();
    PersonJpaController personJpaController = new PersonJpaController();
    ResponsibleJpaController responsibleJpaController = new ResponsibleJpaController();
    ScheduleJpaController scheduleJpaController = new ScheduleJpaController();
    SecretaryJpaController secretaryJpaController = new SecretaryJpaController();
    ShiftJpaController shiftJpaController = new ShiftJpaController();
    UserJpaController userJpaController = new UserJpaController();



    public void createUser(User user) {
        userJpaController.create(user);
    }

    public List<User> getUsers(){
        return userJpaController.findAll();
    }

    public void deleteUser(int id){
        userJpaController.delete(id);
    }

    public User findUser(int id){
        return userJpaController.findById(id);
    }

    public void updateUser(User user){
        userJpaController.update(user);
    }
}

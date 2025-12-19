package persistence;

import logic.User;

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


}

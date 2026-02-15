package persistence;

import logic.*;

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


    //! User

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

    public List<Shift> getShifts() {
        return shiftJpaController.findAll();
    }

    //! Odontologo

    public void createOdontologo(Odontologo odontologo) {
        odontologoJpaController.create(odontologo);
    }

    public List<Odontologo> getOdonto() {
        return odontologoJpaController.findAll();
    }

    public void deleteOdonto(int id) {
        odontologoJpaController.delete(id);
    }


    public Odontologo findOdontologo(int id) {
        return odontologoJpaController.findById(id);
    }

    public void updateOdo(Odontologo odontologo) {
        odontologoJpaController.update(odontologo);
    }

    //! Patient

    public void createPatient(Patient patient) {
        patientJpaController.create(patient);
    }

    public List<Patient> getPatients() {
        return patientJpaController.findAll();
    }

    public void deletePatient(int id) {
        patientJpaController.delete(id);
    }

    public Patient findPatient(int id) {
    return patientJpaController.findById(id);
    }


    public void updatePatient(Patient patient) {
        patientJpaController.update(patient);
    }


    //! Responsible
    public List<Responsible> getResponsible() {
        return responsibleJpaController.findAll();
    }

    public Responsible findResponsible(int id) {
    return responsibleJpaController.findById(id);
    }

    //! Shift
    public void createShift(Shift shift) {
        shiftJpaController.create(shift);
    }

    public void deleteShift(int id) {
      shiftJpaController.delete(id);
    }

    public Shift findShift(int id) {
       return shiftJpaController.findById(id);
    }

    public void updateShift(Shift shift) {
        shiftJpaController.update(shift);
    }

    //* counts
    public int getNumPatients() {
        return patientJpaController.count();
    }

    public int getNumDentist() {
        return odontologoJpaController.count();
    }

    public int getNumShift() {
        return shiftJpaController.count();
    }
}

package logic;

import persistence.ControllerPersistence;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Controller {

    ControllerPersistence controllerPersistence = new ControllerPersistence();

    //? User

    public void createUser(String name, String password, String rol) {

        User user = new User(name, password, rol);

        controllerPersistence.createUser(user);
    }

    public List<User> getUsers() {
        return controllerPersistence.getUsers();
    }

    public void deleteUser(int id) {
        controllerPersistence.deleteUser(id);
    }

    public User findUser(int id) {
        return controllerPersistence.findUser(id);
    }

    public void updateUser(User user) {
        controllerPersistence.updateUser(user);
    }


    //? Odontologo

    public void createOdontologo(String name, String lastname, String dni, String phone, String address, String dateString, String specialilty, String start_time, String end_time, int id) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(dateString);
        Schedule schedule = new Schedule(start_time, end_time);
        User user = this.findUser(id);
        Odontologo odontologo = new Odontologo(dni, name, lastname, phone, address, date, specialilty, schedule, user);

        controllerPersistence.createOdontologo(odontologo);
    }


    public List<Odontologo> getOdonto() {

        return controllerPersistence.getOdonto();
    }

    public void deleteOdonto(int id) {
        controllerPersistence.deleteOdonto(id);
    }


    public Odontologo findOdontologo(int id) {
        return controllerPersistence.findOdontologo(id);
    }

    public void updateOdo(Odontologo odo) {
        controllerPersistence.updateOdo(odo);
    }

    //? Patient
    public void createPatient(String name, String lastname, String dni, String phone, String address, String dateString, String bloodGroup, boolean insurance, String responsibleName, String responsibleLastName, String responsibleDni, String responsibleAddress, String responsiblePhone, String responsibleDateString, String responsibleType) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(dateString);
        Date responsibleDate = sdf.parse(responsibleDateString);

        Responsible responsible = new Responsible(responsibleDni, responsibleName, responsibleLastName, responsiblePhone, responsibleAddress, responsibleDate, responsibleType);

        Patient patient = new Patient(dni, name, lastname, phone, address, date, insurance, bloodGroup, responsible);

        controllerPersistence.createPatient(patient);
    }

    public List<Patient> getPatients() {
        return controllerPersistence.getPatients();
    }

    public void deletePatient(int id) {

        controllerPersistence.deletePatient(id);
    }

    public Patient findPatient(int id) {
        return controllerPersistence.findPatient(id);
    }

    public void updatePatient(Patient patient) {
        controllerPersistence.updatePatient(patient);
    }


    //? Responsible
    public List<Responsible> getResponsible() {
        return controllerPersistence.getResponsible();
    }

    public Responsible findResponsible(int id) {
        return controllerPersistence.findResponsible(id);
    }

    //? Shift
    public void createShift(String affecion, String dateString, String hour, int idOdo, int idPatient) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(dateString);

        Odontologo odontologo = this.findOdontologo(idOdo);
        Patient patient = this.findPatient(idPatient);

        Shift shift = new Shift(date, hour, affecion, odontologo, patient);

        controllerPersistence.createShift(shift);
    }

    public List<Shift> getShifts() {
        return controllerPersistence.getShifts();
    }


    public void deleteShift(int id) {

        controllerPersistence.deleteShift(id);
    }

    public Shift findShift(int id) {
        return controllerPersistence.findShift(id);
    }

    public void updateShift(Shift shift) {
        controllerPersistence.updateShift(shift);
    }

    //? Validation
    public boolean validationUser(String user, String password) {
        boolean ingreso = false;
        List<User> listuser = new ArrayList<User>();
        listuser = controllerPersistence.getUsers();

        for (User u : listuser) {
            if (u.getName_user().equals(user) && u.getPassword_user().equals(password)) {
                ingreso = true;
            } else {
                ingreso = false;
            }
        }
        return ingreso;
    }
}

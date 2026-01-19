package logic;

import persistence.ControllerPersistence;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    public List<Shift> getShifts() {
        return controllerPersistence.getShifts();
    }



    //? Odontologo

    public void createOdontologo(String name, String lastname, String dni, String phone, String address, String dateString, String specialilty, String start_time, String end_time, int id) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(dateString);
        Schedule schedule = new Schedule(start_time,end_time);
        User user = this.findUser(id);

        Odontologo odontologo = new Odontologo(name,lastname,dni,phone,address,date,specialilty,schedule,user);

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
}

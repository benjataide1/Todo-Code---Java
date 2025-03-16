package logic;

import java.util.Date;
import java.util.List;

public class Odontologo extends Person {

    private int id_odontologo;
    private String speciality;
    private Schedule schedule;
    private User user;
    private List<Shift> shifts;

    public Odontologo(String dni, String first_name, String last_name, String phone, String address, Date date, String speciality, Schedule schedule, User user, List<Shift> shifts) {
        super(dni, first_name, last_name, phone, address, date);
        this.speciality = speciality;
        this.schedule = schedule;
        this.user = user;
        this.shifts = shifts;
    }

    public int getId_odontologo() {
        return id_odontologo;
    }


    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Shift> getShifts() {
        return shifts;
    }

    public void setShifts(List<Shift> shifts) {
        this.shifts = shifts;
    }
}

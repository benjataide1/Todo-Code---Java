package logic;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Date;
import java.util.List;


@Entity
public class Odontologo extends Person {

//    private int id_odontologo; / Ya tiene ID propio por que implementa la de clase madre y su estrategia
    private String speciality;
    @OneToOne
    private Schedule schedule;

    @OneToOne
    private User user;

    //? 1 Odontolog tiene N Shifts
    @OneToMany(mappedBy = "odontologo" ) //! Nos dirigimos a la Clase "Shift" y Buscamos la relacion o el atributo, Relacionado con mi Clase "Odontologo", Esto es Conexion Bilateral
    private List<Shift> shifts; public Odontologo(String dni, String first_name, String last_name, String phone, String address, Date date, String speciality, Schedule schedule, User user, List<Shift> shifts) {
        super(dni, first_name, last_name, phone, address, date);
        this.speciality = speciality;
        this.schedule = schedule;
        this.user = user;
        this.shifts = shifts;
    }

    public Odontologo() {

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

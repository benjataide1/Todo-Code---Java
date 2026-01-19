package logic;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Shift {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Basic
    private String shift_hours;
    private String afeccion;

    @ManyToOne
    @JoinColumn(name = "id_odonto")
    //! En mi BD la entiedad Odontologo en la columna "id_shift" aparece la relacion que tiene con la entidad "Shift"
    private Odontologo odontologo; //! N turnos Tienes 1 Odontologo, relacion Bilateral,  el nombre de esta variable es la responsable de conectar o establecer la relacion

    @ManyToOne
    @JoinColumn(name = "id_patient")
    private Patient patient;

    public Shift(Date date, String shift_hours, String afeccion) {
        this.date = date;
        this.shift_hours = shift_hours;
        this.afeccion = afeccion;
    }

    public Shift() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getShift_hours() {
        return shift_hours;
    }

    public void setShift_hours(String shift_hours) {
        this.shift_hours = shift_hours;
    }

    public String getAfeccion() {
        return afeccion;
    }

    public void setAfeccion(String afeccion) {
        this.afeccion = afeccion;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}

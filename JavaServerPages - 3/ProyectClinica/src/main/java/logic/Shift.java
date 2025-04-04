package logic;

import java.util.Date;

public class Shift {

//    private int id_shift;
    private Date date;
    private String shift_hours;
    private String afeccion;

    public Shift(Date date, String shift_hours, String afeccion) {
        this.date = date;
        this.shift_hours = shift_hours;
        this.afeccion = afeccion;
    }

//    public int getId_shift() {
//        return id_shift;
//    }


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
}

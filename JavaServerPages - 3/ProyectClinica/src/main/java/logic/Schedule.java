package logic;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Schedule extends Person {

    @Basic
    private String start_time;
    private String end_time;


    public Schedule(String dni, String first_name, String last_name, String phone, String address, Date date, String start_time, String end_time) {
        super(dni, first_name, last_name, phone, address, date);
        this.start_time = start_time;
        this.end_time = end_time;
    }

    public Schedule() {
        super();
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }
}

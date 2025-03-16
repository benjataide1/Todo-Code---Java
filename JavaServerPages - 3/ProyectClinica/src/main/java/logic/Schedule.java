package logic;

public class Schedule {

    private int id_schedule;
    private String start_time;
    private String end_time;

    public Schedule(String start_time, String end_time) {
        this.start_time = start_time;
        this.end_time = end_time;
    }

    public int getId_schedule() {
        return id_schedule;
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

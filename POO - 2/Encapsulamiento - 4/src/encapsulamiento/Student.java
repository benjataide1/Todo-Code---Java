package encapsulamiento;

public class Student {

    private int id;
    private String name;
    private String last_name;

    public Student() {
    }

    public Student(int id, String name, String last_name) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
    }

    private int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}

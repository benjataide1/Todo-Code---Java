package inheritance;

public class Consultant extends Persona{

    String name_consultant;
    int num_consultant;

    public Consultant() {
    }

    public Consultant(int id, String dni, String name, String last_name, String address, String phone, String name_consultant, int num_consultant) {
        super(id, dni, name, last_name, address, phone);
        this.name_consultant = name_consultant;
        this.num_consultant = num_consultant;
    }

    public int getNum_consultant() {
        return this.num_consultant;
    }

    public void setNum_consultant(int num_consultant) {
        this.num_consultant = num_consultant;
    }

    public String getName_consultant() {
        return this.name_consultant;
    }

    public void setName_consultant(String name_consultant) {
        this.name_consultant = name_consultant;
    }
}

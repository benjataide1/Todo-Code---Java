package logic;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Date;
import java.util.List;

@Entity
public class Patient extends Person {

//    private int id_patient;
    private boolean medium_insurance;
    private String blood_group;
    @OneToOne
    private Responsible responsible;
    @OneToMany
    @JoinColumn(name = "patien")
    private List<Shift> shifts;

    public Patient(String dni, String first_name, String last_name, String phone, String address, Date date, boolean medium_insurance, String blood_group, Responsible responsible, List<Shift> shifts) {
        super(dni, first_name, last_name, phone, address, date);
        this.medium_insurance = medium_insurance;
        this.blood_group = blood_group;
        this.responsible = responsible;
        this.shifts = shifts;
    }

    public Patient() {

    }


    public boolean isMedium_insurance() {
        return medium_insurance;
    }

    public void setMedium_insurance(boolean medium_insurance) {
        this.medium_insurance = medium_insurance;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    public Responsible getResponsible() {
        return responsible;
    }

    public void setResponsible(Responsible responsible) {
        this.responsible = responsible;
    }

    public List<Shift> getShifts() {
        return shifts;
    }

    public void setShifts(List<Shift> shifts) {
        this.shifts = shifts;
    }
}

package persistence;

import logic.Patient;


public class PatientJpaController extends GenericJpaDAO<Patient, Integer> {

    public PatientJpaController() {
        super(Patient.class);
    }

}

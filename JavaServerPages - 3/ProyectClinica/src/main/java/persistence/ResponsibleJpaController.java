package persistence;

import logic.Responsible;


public class ResponsibleJpaController extends GenericJpaDAO<Responsible, Integer> {

    public ResponsibleJpaController() {
        super(Responsible.class);
    }


}

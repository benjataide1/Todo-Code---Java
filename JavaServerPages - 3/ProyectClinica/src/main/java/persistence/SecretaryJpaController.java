package persistence;

import logic.Secretary;


public class SecretaryJpaController extends GenericJpaDAO<Secretary, Integer> {

    public SecretaryJpaController() {
        super(Secretary.class);
    }


}

package persistence;

import logic.Person;


public class PersonJpaController extends GenericJpaDAO<Person, Integer> {

    public PersonJpaController() {
        super(Person.class);
    }

}

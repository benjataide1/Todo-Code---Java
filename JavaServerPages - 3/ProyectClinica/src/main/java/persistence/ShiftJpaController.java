package persistence;

import logic.Shift;

public class ShiftJpaController extends GenericJpaDAO<Shift, Integer> {

    public ShiftJpaController() {
        super(Shift.class);
    }


}

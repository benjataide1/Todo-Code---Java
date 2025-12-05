package persistence;

import logic.Schedule;


public class ScheduleJpaController extends GenericJpaDAO<Schedule, Integer> {

    public ScheduleJpaController() {
        super(Schedule.class);
    }


}

package persistence;

import logic.Schedule;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class ScheduleJpaController {
    private EntityManagerFactory emf = null;

    public ScheduleJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public ScheduleJpaController() {
        this.emf = Persistence.createEntityManagerFactory("myDentalOfficePU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Schedule schedule) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(schedule);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Schedule schedule) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            schedule = em.merge(schedule);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findSchedule(schedule.getId_person()) == null) {
                throw new EntityNotFoundException("The Schedule with id " + schedule.getId_person() + " no longer exists.");
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws EntityNotFoundException {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Schedule schedule;
            try {
                schedule = em.getReference(Schedule.class, id);
                schedule.getId_person();
            } catch (EntityNotFoundException enfe) {
                throw new EntityNotFoundException("The Schedule with id " + id + " no longer exists.");
            }
            em.remove(schedule);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Schedule findSchedule(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Schedule.class, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Schedule> findScheduleEntities() {
        return findScheduleEntities(true, -1, -1);
    }

    public List<Schedule> findScheduleEntities(int maxResults, int firstResult) {
        return findScheduleEntities(false, maxResults, firstResult);
    }

    private List<Schedule> findScheduleEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Schedule> cq = em.getCriteriaBuilder().createQuery(Schedule.class);
            cq.select(cq.from(Schedule.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public int getScheduleCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Long> cq = em.getCriteriaBuilder().createQuery(Long.class);
            Root<Schedule> rt = cq.from(Schedule.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
} 
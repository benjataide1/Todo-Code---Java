package persistence;

import logic.Shift;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class ShiftJpaController {
    private EntityManagerFactory emf = null;

    public ShiftJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public ShiftJpaController() {
        this.emf = Persistence.createEntityManagerFactory("myDentalOfficePU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Shift shift) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(shift);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Shift shift) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            shift = em.merge(shift);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findShift(shift.getId_person()) == null) {
                throw new EntityNotFoundException("The Shift with id " + shift.getId_person() + " no longer exists.");
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
            Shift shift;
            try {
                shift = em.getReference(Shift.class, id);
                shift.getId_person();
            } catch (EntityNotFoundException enfe) {
                throw new EntityNotFoundException("The Shift with id " + id + " no longer exists.");
            }
            em.remove(shift);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Shift findShift(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Shift.class, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Shift> findShiftEntities() {
        return findShiftEntities(true, -1, -1);
    }

    public List<Shift> findShiftEntities(int maxResults, int firstResult) {
        return findShiftEntities(false, maxResults, firstResult);
    }

    private List<Shift> findShiftEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Shift> cq = em.getCriteriaBuilder().createQuery(Shift.class);
            cq.select(cq.from(Shift.class));
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

    public int getShiftCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Long> cq = em.getCriteriaBuilder().createQuery(Long.class);
            Root<Shift> rt = cq.from(Shift.class);
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
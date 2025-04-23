package persistence;

import logic.Responsible;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class ResponsibleJpaController {
    private EntityManagerFactory emf = null;

    public ResponsibleJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public ResponsibleJpaController() {
        this.emf = Persistence.createEntityManagerFactory("myDentalOfficePU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Responsible responsible) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(responsible);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Responsible responsible) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            responsible = em.merge(responsible);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findResponsible(responsible.getId_person()) == null) {
                throw new EntityNotFoundException("The Responsible with id " + responsible.getId_person() + " no longer exists.");
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
            Responsible responsible;
            try {
                responsible = em.getReference(Responsible.class, id);
                responsible.getId_person();
            } catch (EntityNotFoundException enfe) {
                throw new EntityNotFoundException("The Responsible with id " + id + " no longer exists.");
            }
            em.remove(responsible);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Responsible findResponsible(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Responsible.class, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Responsible> findResponsibleEntities() {
        return findResponsibleEntities(true, -1, -1);
    }

    public List<Responsible> findResponsibleEntities(int maxResults, int firstResult) {
        return findResponsibleEntities(false, maxResults, firstResult);
    }

    private List<Responsible> findResponsibleEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Responsible> cq = em.getCriteriaBuilder().createQuery(Responsible.class);
            cq.select(cq.from(Responsible.class));
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

    public int getResponsibleCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Long> cq = em.getCriteriaBuilder().createQuery(Long.class);
            Root<Responsible> rt = cq.from(Responsible.class);
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
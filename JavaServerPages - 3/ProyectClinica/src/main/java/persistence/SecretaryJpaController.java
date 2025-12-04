package persistence;

import logic.Secretary;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class SecretaryJpaController {
    private EntityManagerFactory emf = null;

    public SecretaryJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public SecretaryJpaController() {
        this.emf = Persistence.createEntityManagerFactory("myDentalOfficePU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Secretary secretary) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(secretary);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Secretary secretary) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            secretary = em.merge(secretary);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findSecretary(secretary.getId_person()) == null) {
                throw new EntityNotFoundException("The Secretary with id " + secretary.getId_person() + " no longer exists.");
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
            Secretary secretary;
            try {
                secretary = em.getReference(Secretary.class, id);
                secretary.getId_person();
            } catch (EntityNotFoundException enfe) {
                throw new EntityNotFoundException("The Secretary with id " + id + " no longer exists.");
            }
            em.remove(secretary);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Secretary findSecretary(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Secretary.class, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Secretary> findSecretaryEntities() {
        return findSecretaryEntities(true, -1, -1);
    }

    public List<Secretary> findSecretaryEntities(int maxResults, int firstResult) {
        return findSecretaryEntities(false, maxResults, firstResult);
    }

    private List<Secretary> findSecretaryEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Secretary> cq = em.getCriteriaBuilder().createQuery(Secretary.class);
            cq.select(cq.from(Secretary.class));
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

    public int getSecretaryCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Long> cq = em.getCriteriaBuilder().createQuery(Long.class);
            Root<Secretary> rt = cq.from(Secretary.class);
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
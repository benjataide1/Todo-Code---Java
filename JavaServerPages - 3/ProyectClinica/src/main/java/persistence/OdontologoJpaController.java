package persistence;

import logic.Odontologo;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class OdontologoJpaController {
    private EntityManagerFactory emf = null;

    public OdontologoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public OdontologoJpaController() {
        this.emf = Persistence.createEntityManagerFactory("myDentalOfficePU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Odontologo odontologo) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(odontologo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Odontologo odontologo) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            odontologo = em.merge(odontologo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findOdontologos(odontologo.getId_person()) == null) {
                throw new EntityNotFoundException("The Odontologo with id " + odontologo.getId_person() + " no longer exists.");
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
            Odontologo odontologo;
            try {
                odontologo = em.getReference(Odontologo.class, id);
                odontologo.getId_person();
            } catch (EntityNotFoundException enfe) {
                throw new EntityNotFoundException("The Odontologo with id " + id + " no longer exists.");
            }
            em.remove(odontologo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Odontologo findOdontologos(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Odontologo.class, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Odontologo> findOdonEntities() {
        return findOdonEntities(true, -1, -1);
    }

    public List<Odontologo> findOdonEntities(int maxResults, int firstResult) {
        return findOdonEntities(false, maxResults, firstResult);
    }

    private List<Odontologo> findOdonEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Odontologo> cq = em.getCriteriaBuilder().createQuery(Odontologo.class);
            cq.select(cq.from(Odontologo.class));
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

    public int getOdonCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Long> cq = em.getCriteriaBuilder().createQuery(Long.class);
            Root<Odontologo> rt = cq.from(Odontologo.class);
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

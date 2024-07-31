package org.jpa.controller;

import org.jpa.logic.Carrer;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class CarrerController {
    private EntityManagerFactory emf = null;

    public CarrerController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public CarrerController() {
        this.emf = Persistence.createEntityManagerFactory("miUnidadDePersistencia");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Carrer carrer) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(carrer);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Carrer carrer) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            carrer = em.merge(carrer);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findCarrer(carrer.getId()) == null) {
                throw new EntityNotFoundException("The carrer with id " + carrer.getId() + " no longer exists.");
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
            Carrer carrer;
            try {
                carrer = em.getReference(Carrer.class, id);
                carrer.getId();
            } catch (EntityNotFoundException enfe) {
                throw new EntityNotFoundException("The carrer with id " + id + " no longer exists.");
            }
            em.remove(carrer);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Carrer findCarrer(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Carrer.class, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Carrer> findCarrerEntities() {
        return findCarrerEntities(true, -1, -1);
    }

    public List<Carrer> findCarrerEntities(int maxResults, int firstResult) {
        return findCarrerEntities(false, maxResults, firstResult);
    }

    private List<Carrer> findCarrerEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Carrer> cq = em.getCriteriaBuilder().createQuery(Carrer.class);
            cq.select(cq.from(Carrer.class));
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

    public int getCarrerCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Long> cq = em.getCriteriaBuilder().createQuery(Long.class);
            Root<Carrer> rt = cq.from(Carrer.class);
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

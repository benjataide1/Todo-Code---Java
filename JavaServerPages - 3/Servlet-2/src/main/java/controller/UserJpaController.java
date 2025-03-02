package controller;

import logic.User;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class UserJpaController {
    private EntityManagerFactory emf = null;

    public UserJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    //! Estable la Conexión a la Base de Datos: Usando la configuración en persistence.xml
    public UserJpaController() {
        this.emf = Persistence.createEntityManagerFactory("unityPersistence");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(User user) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(user);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(User user) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            user = em.merge(user);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findStudent(user.getId()) == null) {
                throw new EntityNotFoundException("The User with id " + user.getId() + " no longer exists.");
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
           User user;
            try {
                user = em.getReference(User.class, id);
                user.getId();
            } catch (EntityNotFoundException enfe) {
                throw new EntityNotFoundException("The User with id " + id + " no longer exists.");
            }
            em.remove(user);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public User findStudent(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(User.class, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<User> findUserEntities() {
        return findUserEntities(true, -1, -1);
    }

    public List<User> findUserEntities(int maxResults, int firstResult) {
        return findUserEntities(false, maxResults, firstResult);
    }

    private List<User> findUserEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<User> cq = em.getCriteriaBuilder().createQuery(User.class);
            cq.select(cq.from(User.class));
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

    public int getUserCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Long> cq = em.getCriteriaBuilder().createQuery(Long.class);
            Root<User> rt = cq.from(User.class);
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

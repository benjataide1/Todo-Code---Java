package persistence;

import logic.Person;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class PersonJpaController {
    private EntityManagerFactory emf = null;

    public PersonJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public PersonJpaController() {
        this.emf = Persistence.createEntityManagerFactory("myDentalOfficePU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Person person) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(person);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Person person) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            person = em.merge(person);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPerson(person.getId_person()) == null) {
                throw new EntityNotFoundException("The Person with id " + person.getId_person() + " no longer exists.");
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
            Person person;
            try {
                person = em.getReference(Person.class, id);
                person.getId_person();
            } catch (EntityNotFoundException enfe) {
                throw new EntityNotFoundException("The Person with id " + id + " no longer exists.");
            }
            em.remove(person);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Person findPerson(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Person.class, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Person> findPersonEntities() {
        return findPersonEntities(true, -1, -1);
    }

    public List<Person> findPersonEntities(int maxResults, int firstResult) {
        return findPersonEntities(false, maxResults, firstResult);
    }

    private List<Person> findPersonEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Person> cq = em.getCriteriaBuilder().createQuery(Person.class);
            cq.select(cq.from(Person.class));
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

    public int getPersonCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Long> cq = em.getCriteriaBuilder().createQuery(Long.class);
            Root<Person> rt = cq.from(Person.class);
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
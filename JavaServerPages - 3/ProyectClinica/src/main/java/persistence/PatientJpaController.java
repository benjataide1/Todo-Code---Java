package persistence;


import logic.Patient;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class PatientJpaController {
    private EntityManagerFactory emf = null;

    public PatientJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public PatientJpaController() {
        this.emf = Persistence.createEntityManagerFactory("myDentalOfficePU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Patient patient) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(patient);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Patient patient) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            patient = em.merge(patient);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPatient(patient.getId_person()) == null) {
                throw new EntityNotFoundException("The Patient with id " + patient.getId_person() + " no longer exists.");
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
            Patient patient;
            try {
                patient = em.getReference(Patient.class, id);
                patient.getId_person();
            } catch (EntityNotFoundException enfe) {
                throw new EntityNotFoundException("The Patient with id " + id + " no longer exists.");
            }
            em.remove(patient);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Patient findPatient(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Patient.class, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Patient> findPatientEntities() {
        return findPatientEntities(true, -1, -1);
    }

    public List<Patient> findPatientEntities(int maxResults, int firstResult) {
        return findPatientEntities(false, maxResults, firstResult);
    }

    private List<Patient> findPatientEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Patient> cq = em.getCriteriaBuilder().createQuery(Patient.class);
            cq.select(cq.from(Patient.class));
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

    public int getPatientCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Long> cq = em.getCriteriaBuilder().createQuery(Long.class);
            Root<Patient> rt = cq.from(Patient.class);
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

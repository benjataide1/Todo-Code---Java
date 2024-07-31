package org.jpa.controller;


import org.jpa.logic.Student;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

//! Esta Clase Tiene todas las funciones CRUD de mi Entity "Student"

public class StudentJpaController {
    private EntityManagerFactory emf = null;

    public StudentJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    //! Estable la Conexión a la Base de Datos: Usando la configuración en persistence.xml
    public StudentJpaController() {
        this.emf = Persistence.createEntityManagerFactory("miUnidadDePersistencia");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Student student) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(student);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Student student) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            student = em.merge(student);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findStudent(student.getId()) == null) {
                throw new EntityNotFoundException("The student with id " + student.getId() + " no longer exists.");
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
            Student student;
            try {
                student = em.getReference(Student.class, id);
                student.getId();
            } catch (EntityNotFoundException enfe) {
                throw new EntityNotFoundException("The student with id " + id + " no longer exists.");
            }
            em.remove(student);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Student findStudent(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Student.class, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Student> findStudentEntities() {
        return findStudentEntities(true, -1, -1);
    }

    public List<Student> findStudentEntities(int maxResults, int firstResult) {
        return findStudentEntities(false, maxResults, firstResult);
    }

    private List<Student> findStudentEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Student> cq = em.getCriteriaBuilder().createQuery(Student.class);
            cq.select(cq.from(Student.class));
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

    public int getStudentCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Long> cq = em.getCriteriaBuilder().createQuery(Long.class);
            Root<Student> rt = cq.from(Student.class);
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

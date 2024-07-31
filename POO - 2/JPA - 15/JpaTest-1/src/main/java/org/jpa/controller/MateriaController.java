package org.jpa.controller;

import org.jpa.logic.Materia;

import javax.persistence.*;

import java.util.List;

public class MateriaController {


    private EntityManagerFactory emf = null;

    public MateriaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public MateriaController() {
        this.emf = Persistence.createEntityManagerFactory("miUnidadDePersistencia");
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    // Método para crear una nueva Materia
    public void create(Materia materia) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = null;
        try {
            tx = em.getTransaction();
            tx.begin();
            em.persist(materia);
            tx.commit();
        } catch (RuntimeException e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw e;
        } finally {
            em.close();
        }
    }

    // Método para obtener una Materia por su ID
    public Materia findMateria(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Materia.class, id);
        } finally {
            em.close();
        }
    }

    // Método para obtener todas las Materias
    public List<Materia> findAllMaterias() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Materia> query = em.createQuery("SELECT m FROM Materia m", Materia.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    // Método para actualizar una Materia
    public void update(Materia materia) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = null;
        try {
            tx = em.getTransaction();
            tx.begin();
            em.merge(materia);
            tx.commit();
        } catch (RuntimeException e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw e;
        } finally {
            em.close();
        }
    }

    // Método para eliminar una Materia
    public void delete(int id) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = null;
        try {
            tx = em.getTransaction();
            tx.begin();
            Materia materia = em.find(Materia.class, id);
            if (materia != null) {
                em.remove(materia);
            }
            tx.commit();
        } catch (RuntimeException e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw e;
        } finally {
            em.close();
        }
    }
}



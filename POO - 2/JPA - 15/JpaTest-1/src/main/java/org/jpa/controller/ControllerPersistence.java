package org.jpa.controller;

import org.jpa.logic.Carrer;
import org.jpa.logic.Materia;
import org.jpa.logic.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ControllerPersistence {

    //? Esta clase se encargar de Crear Funciones CRUD y utilizar la logica/funciones de el "StudentController"

    //! Me instancio para Menjar las funciones CRUD
    StudentJpaController stuJpa = new StudentJpaController();
    CarrerController carrerController = new CarrerController();
    MateriaController materiaController = new MateriaController();


    public void createStudent(Student student) {
        stuJpa.create(student);
    }

    public void deleteStudent(int id) {
        stuJpa.destroy(id);

    }

    public void editStudent(Student student) {
        try {
            stuJpa.edit(student);
        } catch (Exception e) {
            e.getCause();
            e.getMessage();
        }

    }

    public Student findStudent(int id) {
        return stuJpa.findStudent(id);
    }


    public ArrayList<Student> allStudent() {
        List<Student> lista = stuJpa.findStudentEntities();
        ArrayList<Student> arrayStudent = new ArrayList<>(lista); //! Copio los valores de la "List" y los coloco en mi ArrayList
        return arrayStudent;
    }


    //* Carrer

    public void createCarrer(Carrer carrer) {
        carrerController.create(carrer);
    }

    public void deleteCarrer(int id) {
        carrerController.destroy(id);
    }

    public void editCarrer(Carrer carrer) {
        try {
            carrerController.edit(carrer);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public Carrer findCarrer(int id) {
        return carrerController.findCarrer(id);
    }

    public ArrayList<Carrer> allCarrer() {
        List<Carrer> carrer = carrerController.findCarrerEntities();
        ArrayList<Carrer> arrayCarrer = new ArrayList<>(carrer); //! Copio los valores de la "List" y los coloco en mi ArrayList
        return arrayCarrer;
    }


    //*Materia
    public void createMateria(Materia materia) {
        materiaController.create(materia);
    }

    public void deleteMateria(int id) {
        materiaController.delete(id);
    }

    public void editMateria(Materia materia) {
        try {
            materiaController.update(materia);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public Materia findMateria(int id) {
        return materiaController.findMateria(id);
    }

    public List<Materia> allMaterias() {
        return materiaController.findAllMaterias();
    }
}

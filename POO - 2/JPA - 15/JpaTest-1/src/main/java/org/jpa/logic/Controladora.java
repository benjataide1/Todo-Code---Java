package org.jpa.logic;

import org.jpa.controller.ControllerPersistence;


import java.util.*;

public class Controladora {

    //! Esta clase implementa sus propias funciones CRUD pero utiliza la logica/funciones de "ControllerPersistence"

    ControllerPersistence controlPersis = new ControllerPersistence();

    public void createStudent(Student student) {
        controlPersis.createStudent(student);
    }

    public void deleteStudent(int id) {
        controlPersis.deleteStudent(id);
    }

    public void editStudent(Student student) {
        controlPersis.editStudent(student);
        ArrayList<String> liste = new ArrayList<>();
    }

    public Student findStudent(int id) {
        return controlPersis.findStudent(id);
    }

    public ArrayList<Student> allStudent() {
        return controlPersis.allStudent();
    }

    //* Carrera

    public void createCarrer(Carrer carrer) {
        controlPersis.createCarrer(carrer);
    }

    public void deleteCarrer(int id) {
        controlPersis.deleteCarrer(id);
    }

    public void editCarrer(Carrer carrer) {
        controlPersis.editCarrer(carrer);
        ArrayList<String> liste = new ArrayList<>();
    }

    public Carrer findCarrer(int id) {
        return controlPersis.findCarrer(id);
    }

    public ArrayList<Carrer> allCarrer() {
        return controlPersis.allCarrer();
    }


    //* Materia

    public void createMateria(Materia materia) {
        controlPersis.createMateria(materia);
    }

    public void deleteMateria(int id) {
        controlPersis.deleteMateria(id);
    }

    public void editMateria(Materia materia) {
        controlPersis.editMateria(materia);
    }

    public Materia findMateria(int id) {
        return controlPersis.findMateria(id);
    }

    public List<Materia> allMateria() {
        return controlPersis.allMaterias();
    }


}

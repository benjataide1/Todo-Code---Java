package org.jpa.test;

import org.jpa.logic.Carrer;
import org.jpa.logic.Controladora;
import org.jpa.logic.Materia;
import org.jpa.logic.Student;

import java.util.Date;
import java.util.LinkedList;

//! Simulamos que viene del Front-End esta informacion vendria de la Controladora no del "MAIN"
public class JpaTest {
    public static void main(String[] args) {

        Controladora controller = new Controladora();


        // ------------- n / n -----------------

        //* Creamos la Lista y la agregamos
        LinkedList<Materia> materiaLinkedList = new LinkedList<>();
        LinkedList<Materia> materiaLinkedList1 = new LinkedList<>();

        //* Creacion Carrer con lista de Materia
        Carrer carrer = new Carrer("Programmer", materiaLinkedList);
        Carrer carrer1 = new Carrer("Nursery", materiaLinkedList1);

        //* Guardamos Carrera en BD
        controller.createCarrer(carrer);
        controller.createCarrer(carrer1);

        //* Creacion Materias
        Materia materias = new Materia("Base de Datos", "Cuatrimestral", carrer);
        Materia materias1 = new Materia("Python", "Semanal", carrer);
        Materia materias2 = new Materia("Java", "Anual", carrer);

        Materia materia = new Materia("Adultos y Ancianos", "Cuatrimestral", carrer1);
        Materia materia1 = new Materia("Biologia 1", "Anual", carrer1);
        Materia materia2 = new Materia("Ingles - A", "Cuatrimestral", carrer1);

        //* Guardamos Materia en la BD

        controller.createMateria(materias);
        controller.createMateria(materias1);
        controller.createMateria(materias2);

        controller.createMateria(materia);
        controller.createMateria(materia1);
        controller.createMateria(materia2);

        //* Agreagmos a la lista de Materias
        materiaLinkedList.add(materias);
        materiaLinkedList.add(materias1);
        materiaLinkedList.add(materias2);

        materiaLinkedList1.add(materia);
        materiaLinkedList1.add(materia1);
        materiaLinkedList1.add(materia2);


        //* Actualizamos nuestra Entity Carrer y le Agremos los Datos Nuevo
        carrer.setMateriaList(materiaLinkedList);
        controller.editCarrer(carrer);

        carrer1.setMateriaList(materiaLinkedList1);
        controller.editCarrer(carrer1);


        //* Creacion Student
        Student Benjamin = new Student(carrer, new Date(), "Ataide", "Benjamin");
        Student Jazmin = new Student(carrer1, new Date(), "Valdivia", "Julieta Jazmin");

        //* Guardo Student en la BD
        controller.createStudent(Benjamin);
        controller.createStudent(Jazmin);


        // ---------- 1 / n ------------

        //! Cree Objetos Carrer

//        Carrer carrer = new Carrer("Programmer");
//        Carrer carrer1 = new Carrer("Arquitecto");


        //! Los guardo Objetos Carrer en mi BD
//        controller.createCarrer(carrer);
//        controller.createCarrer(carrer1);

        //! Creeo Objetos Student y les asigo Objetos Carrer
//        Student Agus = new Student(carrer, new Date(), "Galindez", "Agustin");
//        Student Mateo = new Student(carrer1, new Date(), "Guevara", "Mateo");

        //! Guardo Objetos Student en mi BD
//        controller.createStudent(Agus);
//        controller.createStudent(Mateo);

//        System.out.println("-".repeat(15));

//        Student stu = controller.findStudent(3);
//        System.out.println("Student Find: " + stu.toString());


        // ----------- Inserccion -------------

        //! Insertar Info a mi Entity
     /*
       controller.createStudent(Julieta);
        controller.createStudent(student);
        controller.createStudent(new Student(3, "Franco", "Lopez", new Date()));
        controller.createStudent(new Student(4, "Joaquin", "Rios", new Date()));
    */
        //! Eliminar Info de mi Entity
//        controller.deleteStudent(2);

        //! Cambiar Info de mi Entity
//        Julieta.setLastname("Validiviaa");
//        controller.editStudent(Julieta);

        //! Encontrar/Buscar Student en mi Entity
//        Student stu1 = controller.findStudent(3);
//        System.out.println("The Student is: " + stu1.toString());
//

        //! Encontrar/Buscar todos los Students en mi Entity
//        ArrayList<Student> allStudent = controller.allStudent();

//        controller.allStudent().forEach((Student stu) -> {
//            System.out.println(stu.toString());
//        });
//
    }
}

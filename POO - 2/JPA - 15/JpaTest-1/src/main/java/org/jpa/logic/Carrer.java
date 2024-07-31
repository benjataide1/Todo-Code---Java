package org.jpa.logic;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity(name = "Carrera")
public class Carrer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Basic
    private String name;

    //! De esta Forma Mapeo y hago referencia que voy a estar conectado 1/n a mi Materia con la variable "carre"
    @OneToMany(mappedBy = "carre")
    private List<Materia> materiaList;

    public Carrer() {
    }

    //! NO agrego el id por que se AutoIncrementa
    public Carrer(String name, LinkedList<Materia> materiaList) {
        this.name = name;
        this.materiaList = materiaList;
    }

    public List<Materia> getMateriaList() {
        return materiaList;
    }

    public void setMateriaList(LinkedList<Materia> materiaList) {
        this.materiaList = materiaList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Carrer{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

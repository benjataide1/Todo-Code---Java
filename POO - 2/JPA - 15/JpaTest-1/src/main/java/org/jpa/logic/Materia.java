package org.jpa.logic;

import javax.persistence.*;

@Entity
public class Materia {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    private String name;
    private String type;

    //? En la BD se ve difernte por que Mapea Distinto Esta del lado de la N, por lo cual, N Materias pertenecen a 1 Carrer ---> Yo en Java hice, 1 Carrer Tiene N Materias
    @ManyToOne //! De esta Menera Logro conectar o Establecer 1/n, n materias tiene 1 Carrer
    private Carrer carre; //! El nombre de la variable es importante para poder mapear con la Entity Carrer

    public Materia() {
    }

    public Materia( String name, String type,Carrer carre) {
        this.carre = carre;
        this.name = name;
        this.type = type;
    }

    public Carrer getCarre() {
        return carre;
    }

    public void setCarre(Carrer carre) {
        this.carre = carre;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

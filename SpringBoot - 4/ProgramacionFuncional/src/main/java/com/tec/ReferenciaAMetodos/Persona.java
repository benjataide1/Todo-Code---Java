package com.tec.ReferenciaAMetodos;

public class Persona {
    String nombre;
    double estatura;

    public Persona() {
    }

    public Persona(String nombre,Double estatura) {
        this.estatura = estatura;
        this.nombre = nombre;
    }

    public void saludar(){

        System.out.println("HOla mi nombre es: " + nombre + " y mido: " + estatura);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("estatura=").append(estatura);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

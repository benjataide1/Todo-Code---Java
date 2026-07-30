package com.tec.Ejercicio_2.logic;

public class Producto {
    private  String name;
    private String categoria;
    private int cantidad;
    private double precio;

    public Producto() {
    }

    public Producto(String name, String categoria, int cantidad, double precio) {
        this.name = name;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Producto{");
        sb.append("name='").append(name).append('\'');
        sb.append(", categoria='").append(categoria).append('\'');
        sb.append(", cantidad=").append(cantidad);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}

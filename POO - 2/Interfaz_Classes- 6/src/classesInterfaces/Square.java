package classesInterfaces;

//! I implements two interfaces
public class Square implements Figure, Dibujable {

    private double lado;

    public Square() {
    }

    public Square(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculat_Area() {
        return this.lado * this.lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Hello,I'm paiting a square");
    }
}

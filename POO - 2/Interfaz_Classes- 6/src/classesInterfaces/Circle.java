package classesInterfaces;

//! I implements three interfaces
public class Circle implements Figure, Dibujable, Rotable {

    private double radio;

    public Circle() {
    }

    public Circle(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculat_Area() {
        return (Math.PI * this.radio) * this.radio;
    }

    @Override
    public void dibujar() {
        System.out.println("I'm paiting a Circle");
    }

    @Override
    public void rotar() {
        System.out.println("I'm rotando a circle");
    }
}

package classesabstractas;

public abstract class Figure {

    protected double x;
    protected double y;

    protected Figure() {
    }

    protected Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //! at least one abstract method
    public abstract double calculat_Area();
}

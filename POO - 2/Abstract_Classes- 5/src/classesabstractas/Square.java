package classesabstractas;

public class Square extends Figure {

    private double lado;

    public Square() {
    }

    public Square(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    @Override
    public double calculat_Area() {
        return this.lado * this.lado;
    }
}

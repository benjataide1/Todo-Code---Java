package classesabstractas;

public class Circle extends Figure {

    private double radio;

    public Circle() {
    }

    public Circle(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public double calculat_Area() {
        return (Math.PI * this.radio) * this.radio;
    }
}

public class Triangle extends Figure {
    private double a, b, c;


    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double halfP = perimetr() / 2;
        return Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
    }

    @Override
    public double perimetr() {
        return a + b + c;
    }
}

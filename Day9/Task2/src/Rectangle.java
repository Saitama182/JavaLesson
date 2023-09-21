public class Rectangle extends Figure {
    private double width, height;

    public Rectangle (double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimetr() {
        return 2 * (width + height);
    }
}

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("Red", 10, 10, 5),
                new Triangle("Blue", 10, 10, 5),
                new Triangle("Green", 10, 10, 12),
                new Rectangle(12, 2, "Red"),
                new Circle(5, "Black"),
                new Circle(5, "Red")
        };

        System.out.println(calculateRedPerimetr(figures));
        System.out.println(calculateRedArea(figures));
    }

    public static double calculateRedPerimetr(Figure[] figures) {
        double sum = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red"))
                sum += figure.perimetr();
        }
        return sum;
    }
    public static double calculateRedArea(Figure[] figures) {
        double sum = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red"))
                sum += figure.area();
        }
        return sum;
    }

}
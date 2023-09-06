public class Bike {
    private String color;
    private String yearOfRelease;
    private String model;

    public Bike(String color, String yearOfRelease, String model) {
        this.color = color;
        this.yearOfRelease = yearOfRelease;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public String getModel() {
        return model;
    }
}

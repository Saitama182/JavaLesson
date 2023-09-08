import java.util.Scanner;

public class Car {
    private int yearOfManufacture;
    private String color;
    private String model;



    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }




    public  void difference() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int yearToDay = scanner.nextInt();
        System.out.println("разница между годом выпуска и переданным годом " + (yearToDay - yearOfManufacture));
    }








}

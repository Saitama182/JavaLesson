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

    public void  info() {
        System.out.println("Это автомобиль");
    }




    public  int difference (int yearToDay) {
        return  yearToDay - yearOfManufacture;
    }








}

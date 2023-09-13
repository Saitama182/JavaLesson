public class Plane {
    private String manufacturer;
    private int yearOfManufacture;
    private int length;
    private int weight;
    private int fuelVolumeInTheTank;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuelVolumeInTheTank(int fuelVolumeInTheTank) {
        this.fuelVolumeInTheTank = fuelVolumeInTheTank;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public int getFuelVolumeInTheTank() {
        return fuelVolumeInTheTank;
    }

    public void fillUp(int inputFuel){
        fuelVolumeInTheTank += inputFuel;
    }

    public Plane(String manufacturer, int yearOfManufacture, int length, int weight) {
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
        this.length = length;
        this.weight = weight;
        this.fuelVolumeInTheTank = 0;
    }


    public void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + yearOfManufacture + ", длина: " + length
                + ", вес: " + weight + ", обьем топлива в баке: " + fuelVolumeInTheTank);
    }

    public static void lengthComparison(Plane plane1, Plane plane2){
        if (plane1.getLength() > plane2.getLength()){
            System.out.println("1 > 2 ");
        } else if (plane1.getLength() < plane2.getLength()) {
            System.out.println("2 > 1");
        } else {
            System.out.println("=");
        }
    }
}

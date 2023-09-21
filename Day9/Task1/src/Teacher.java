public class Teacher extends Human {
    private String itemName;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Teacher(String nameHuman, String itemName) {
        super(nameHuman);
        this.itemName = itemName;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + getNameHuman());
    }

}

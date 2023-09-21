public class Human {
    private String nameHuman;

    public String getNameHuman() {
        return nameHuman;
    }

    public void setNameHuman(String nameHuman) {
        this.nameHuman = nameHuman;
    }

    public Human(String nameHuman) {
        this.nameHuman = nameHuman;
    }

    public void printInfo() {
        System.out.println("Этот человек с именем " + nameHuman);
    }

}

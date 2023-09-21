public class Student extends Human {
    private String NameOfTheStudyGroup;

    public String getNameOfTheStudyGroup() {
        return NameOfTheStudyGroup;
    }

    public void setNameOfTheStudyGroup(String nameOfTheStudyGroup) {
        NameOfTheStudyGroup = nameOfTheStudyGroup;
    }

    public Student(String nameHuman, String nameOfTheStudyGroup) {
        super(nameHuman);
        this.NameOfTheStudyGroup = nameOfTheStudyGroup;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + getNameHuman());
    }
}

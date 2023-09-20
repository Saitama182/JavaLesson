public class Student extends Human{
    private String NameOfTheStudyGroup;

    public String getNameOfTheStudyGroup() {
        return NameOfTheStudyGroup;
    }

    public void setNameOfTheStudyGroup(String nameOfTheStudyGroup) {
        NameOfTheStudyGroup = nameOfTheStudyGroup;
    }

    public Student(String nameHuman, String nameOfTheStudyGroup) {
        super(nameHuman);
        NameOfTheStudyGroup = nameOfTheStudyGroup;
    }
}

import java.util.Random;

public class Teacher {
    private String teachlastNameFirstNamePatronymic;
    private String Subject;

    public Teacher(String lastNameFirstNamePatronymic, String subject) {
        this.teachlastNameFirstNamePatronymic = lastNameFirstNamePatronymic;
        this.Subject = subject;

    }

    public void setTeachlastNameFirstNamePatronymic(String teachlastNameFirstNamePatronymic) {
        this.teachlastNameFirstNamePatronymic = teachlastNameFirstNamePatronymic;
    }

    public void setSubject(String subject) {
        this.Subject = subject;
    }

    public String getTeachlastNameFirstNamePatronymic() {
        return teachlastNameFirstNamePatronymic;
    }

    public String getSubject() {
        return Subject;
    }


    public void rateTheStudent(Student student) {
        Random random = new Random();
        int estimation = random.nextInt(4) + 2;
        if (estimation == 5) {
            System.out.println(this.teachlastNameFirstNamePatronymic + " оценил студента с именем " + student.getStudLastNameFirstNamePatronymic() + " отлично " +
                    " по предмету " + this.Subject);
        } else if (estimation == 4) {
            System.out.println(this.teachlastNameFirstNamePatronymic + " оценил студента с именем " + student.getStudLastNameFirstNamePatronymic() + " хорошо " +
                    " по предмету " + this.Subject);
        } else if (estimation == 3) {
            System.out.println(this.teachlastNameFirstNamePatronymic + " оценил студента с именем " + student.getStudLastNameFirstNamePatronymic() + " удовлетворительно " +
                    " по предмету " + this.Subject);
        } else {
            System.out.println(this.teachlastNameFirstNamePatronymic + " оценил студента с именем " + student.getStudLastNameFirstNamePatronymic() + " неудовлетворительно " +
                    " по предмету " + this.Subject);
        }
    }

}

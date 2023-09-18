public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.age = 44;
        int yearss = person1.calcYear();
        System.out.println(yearss);
    }
}
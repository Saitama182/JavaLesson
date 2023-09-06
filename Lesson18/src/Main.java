public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Bob");
        person1.setAge(100);
        System.out.println("Выводим значение в main методе " + person1.getName());
        System.out.println("Выводим значение в main методе " + person1.getAge());
    }
}
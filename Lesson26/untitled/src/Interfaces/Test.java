package Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Jack");
        animal1.showInfo();
        animal1.sleep();
        person1.showInfo();
        person1.sayHello();

        Info info1 = new Animal(2);
        Info info2 = new Person("Bob");

        info1.showInfo();
        info2.showInfo();

        outPutInfo(info1);
        outPutInfo(info2);

        Animal animal2 = new Animal(3);
        Person person2 = new Person("Chuck");

        outPutInfo(animal2);
        outPutInfo(person2);
    }

    public static void outPutInfo(Info info) {
        info.showInfo();
    }


}

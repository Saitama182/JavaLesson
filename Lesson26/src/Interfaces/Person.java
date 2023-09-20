package Interfaces;

public class Person implements Info {
    public String namePers;

    public Person(String name) {
        this.namePers = name;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public void showInfo() {
        System.out.println("Name is " + this.namePers);
    }
}

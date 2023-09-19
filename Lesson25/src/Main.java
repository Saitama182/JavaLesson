public class Main {
    public static void main(String[] args) {
       Animal animal = new Animal();
       animal.eat();
       animal.sleep();
       Dog dog = new Dog();
       dog.eat();
       dog.sleep();
       dog.bark();
       dog.name = "jjj";
       dog.showName();
    }
}
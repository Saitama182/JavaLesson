public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        Animal animal1 = new Dog();
        animal1.eat();
        // animal1.bark(); - нельзя

        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Animal animal3 = new Animal();
        Dog dog3 = new Dog();
        Cat cat3 = new Cat();

        test(animal3);
        test(dog3);
        test(cat3);


    }
    public static void test (Animal animal) {
        animal.eat();
    }

}
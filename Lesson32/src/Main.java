public class Main {
    public static void main(String[] args) {

        // Upcasting - Восходящее преобразование
        Animal animal = new Dog();
        animal.eat();
        // или
        Dog dog = new Dog();
        Animal animal1 = dog;
        animal1.eat();

        // Downcasting - Нисходящее преобразование

        Dog dog2 = (Dog)animal1;
        dog2.bark();
    }
}
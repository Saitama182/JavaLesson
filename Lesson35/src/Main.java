class Animal {
    public void eat() {
        System.out.println("Animal is eating ....");
    }
}


interface AbleToEat {
    public void eat2();
}



public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Animal animal12 = new Animal() {
            public void eat() {
                System.out.println("Other animal is eating... ");
            }
        };
        animal12.eat();

        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat2() {
                System.out.println("Someone is eating ...");
            }
        };
        ableToEat.eat2();
    }
}
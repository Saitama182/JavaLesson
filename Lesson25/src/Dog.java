public class Dog extends Animal {


    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void bark() {
        System.out.println("I am barking");
    }

    public void showName(){
        System.out.println(name);
    }
}

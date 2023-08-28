import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal>lisAnimals = new ArrayList<>();
        lisAnimals.add(new Animal(1));
        lisAnimals.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(lisAnimals);
        test(listOfDogs);

    }
    private static void test(List<? extends Animal> list){
        for(Animal animal : list) {
            animal.eat();
        }

    }
}
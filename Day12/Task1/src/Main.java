import java.util.ArrayList;
import java.util.List;

/*
Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
Добавить в середину еще один автомобиль , удалить самый первый автомоболи из списка.Распечатать список.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Audi");
        list.add("BMW");
        list.add("Toyota");
        list.add("Tesla");
        list.add("Lada");

        System.out.println(list);

        list.add(2,"Lexus");
        System.out.println(list);

        list.remove(0);

        System.out.println(list);




    }
}
/**
 * Создать класс Автомобиль с полями Год выпуска , Цвет , Модель.
 * Создать геттеры и сеттеры для каждого поля. Создать экземпляр класса Автомобиль.
 * задать сеттером каждое поле , вывести  в консоль значение каждого поля геттером.
 * Созданный вами класс должен отвечать принципам инкапсуляции.
 * В созданном классе Автомобиль реализовать два метода:
 * 1)Выводит в консоль строку это автомобиль.
 * 2) Принимает на вход число и озвращает разницу между годом выпуска и переданным годом
 *
 */
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("x6");
        car1.setColor("Black");
        car1.setYearOfManufacture(2006);
        System.out.println(car1.difference(2021));
        car1.info();

    }
}

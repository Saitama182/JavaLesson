/**
 * Создать класс Автомобиль с полями Год выпуска , Цвет , Модель.
 * Создать геттеры и сеттеры для каждого поля. Создать экземпляр класса Автомобиль.
 * задать сеттером каждое поле , вывести  в консоль значение каждого поля геттером.
 * Созданный вами класс должен отвечать принципам инкапсуляции.
 */
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColor("Green");
        car1.setModel("x5");
        car1.setYearOfRelease("1996");

        System.out.println("Год выпуска " + car1.getYearOfRelease());
        System.out.println("Цвет " + car1.getColor());
        System.out.println("Модель " + car1.getModel());

    }
}
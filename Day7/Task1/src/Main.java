/**
 * Создать класс Самолет с полями : Изготовитель, год выпуска, длина, вес, объем топлива в баке.
 * создать конструктор класс самолет, принимающий  в качестве аргументов значение четырех полей.
 * в конструкторе для передачи полям значений использовать слово this
 * так же реализовать метод info который выводит сообщение в следующем формате
 * Изготовитель: , год выпуска: , длина: , вес: , обьем топлива в баке:.
 * Так же необходимо реализовать метод fillUp
 * который в качестве аргумента принимает число и заправляет самолет на это значение
 * Создать новый обьект класса самолет с произвольными данными
 * Изменить длинну и год выпуска с помощью сеттеров , вызвать метод fillUp два раза,
 * вызвать метод info
 *
 *
 В классе самолет создать статический метод, который в качестве аргументов принимает два обьекта(два самолета) и
 * выводит сообщение в консоль о том , какой из самолетов длинее.
 */
public class Main {
    public static void main(String[] args) {

        Plane plane1 = new Plane("Boeing", 1996, 120, 30);
        Plane plane2 = new Plane("Boeing", 1998, 126, 35);
        plane1.fillUp(12);
        plane1.fillUp(24);

        plane1.setLength(121);
        plane1.setWeight(31);
        plane1.info();

        Plane.lengthComparison(plane1,plane2);

    }
}
/**
 * обьявите переменную типа int имя переменной к
 * присвойте этой переменной какую-нибудь цифру от 1 до 9
 * Используя цикл на ваше усмотрение
 * выведите в консоль таблицу умножения для этой цифры в следующем формате
 */

public class Task6 {
    public static void main(String[] args) {
        int k = 4;
        int i = 1;
        do {
            System.out.println(i + "x" + k + " = " + i * k );
            i++;
        } while (i < 11);
    }
}

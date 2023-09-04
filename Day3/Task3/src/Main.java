import java.util.Scanner;

/**Реализовать программу , которая пять раз запрашивает от пользователя два числа- делимое и делитель
 * Для этих двух чисел программа расчитывает результат деления и выводит его в консоль.
 * Если пользователь вводит 0 в качестве делителя , вместо того , чтобы остановить работу цикла принудительно,
 * мы пропускаем интерацию и выводим сообщение Деление на 0.
 * Ключевое слово else использовать в этой программе нельзя.
 *
 *
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (counter < 5) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            counter++;


            if (b == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(a/b);
        }
    }
}
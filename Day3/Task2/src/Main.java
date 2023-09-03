import java.util.Scanner;

/**Реализовать программу которая пока работает принимает на вход от пользователей два числа
 * числитель и знаменатель.Для этих двух чисел программа расчитывает результат деления и выводит его в консоль
 * Программа останавливает свою работу когда 0 вводят в качестве делителя.
 *
 *
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("введите числитель");
            double a = scanner.nextDouble();
            System.out.println("введите знаменатель");
            double b = scanner.nextDouble();
            if (b == 0){
                break;
            }
            System.out.println(a/b);
        }



    }
}
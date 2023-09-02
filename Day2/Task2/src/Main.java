import java.util.Scanner;

/**
 * Есть два числа, которые задаются пользователем через консоль (назовем эти числа a и b).
 * Вывести все числа из диапазона между a и b , которые делятся на 5 без остатка , но при этом не делятся на 10 без остатка.
 */

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = s.nextInt();
        System.out.println("Введите второе число: ");
        int b = s.nextInt();
        System.out.println("Вы ввели а = " + a + " b = " + b);
        System.out.print("Числа которые делятся на 5 без остатка , но при этом не делятся на 10 без остатка: ");
        for (int i = a + 1; i < b; i++) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
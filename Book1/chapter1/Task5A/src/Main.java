/*
Введите целые числа и подсчитать их суммы и произведения. Вывести результат в консоль.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите 1 число");
        int a = s.nextInt();
        System.out.println("Введите 2 число");
        int b = s.nextInt();
        System.out.println("Сумма = " + (a + b) + ", произведение = " + (a * b));
    }
}
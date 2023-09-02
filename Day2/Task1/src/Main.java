import java.util.Scanner;

/**
 * Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner
 * число соответсвующее количеству этажей в здании.
 * Используя ксловный оператор if , неободимо вывести в консоль сообщение о типе такого дома.
 * Условия: 1-4 - Малоэтажный дом, 5-8 - Среднеэтажный дом, 9 и более -Многоэтажный дом.
 * Так же , необходимо учесть что может быть отрицательное значение - некорректный ввод.
 */

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число соответсвующее количеству этажей в здании: ");
        int floor = s.nextInt();
        if (floor > 0 && floor <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (floor >= 5 && floor <= 8 ) {
            System.out.println("Cреднеэтажный дом");
        } else if (floor >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Hекорректный ввод");
        }

    }
}
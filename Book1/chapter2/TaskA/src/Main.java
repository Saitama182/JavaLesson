/*
Ввести n чисел c консоли.
1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество чисел (n): ");
            int n = scanner.nextInt();
            scanner.nextLine(); // после ввода каждого числа используется scanner.nextLine() для считывания символа новой строки, чтобы избежать проблем с буфером ввода.
            String[] numbers = new String[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Введите " + (i + 1) + " число: ");
                numbers[i] = scanner.nextLine();
            }
            System.out.println("Исходный массив: ");
            for (String num : numbers) {
                System.out.println(num);
            }

            System.out.println("Задание 1 - Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.");
            printShortAndLong(numbers);

            scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    /**
     * Выводит на консоль самое короткое и самое длинное число из массива и их длину.
     *
     * @param numbers Массив чисел для анализа.
     */
    private static void printShortAndLong(String[] numbers) {
        int maxLength = numbers[0].length();
        String maxNum = numbers[0];
        int minLength = numbers[0].length();
        String minNum = numbers[0];

        for (String num : numbers) {
            if (num.length() > maxLength) {
                maxLength = num.length();
                maxNum = num;
            }
            if (num.length() < minLength) {
                minLength = num.length();
                minNum = num;
            }
        }
        System.out.println("Самое длинное число: " + maxNum + " , его длина " + maxLength);
        System.out.println("Самое короткое число: " + minNum + " , его длина " + minLength);
    }
}
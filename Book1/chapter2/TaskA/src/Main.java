/*
Ввести n чисел c консоли.
1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины
3. Вывести на консоль те числа, длина которых меньше (больше) средней,
а также длину
4. Найти число, в котором число различных цифр минимально. Если таких
чисел несколько, найти первое из них.
 */


import java.util.Arrays;
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
            System.out.println("Задание 2 - Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.");
            printInAscendingOrder(numbers);
            printInDescendingOrder(numbers);
            System.out.println("Задание 3 - Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.");
            printNumbersWithLengthComparison(numbers);
            System.out.println("Задание 4 - Найти число, в котором число различных цифр минимально. Если таких чисел несколько, " +
                    "найти первое из них.");
            printNumberOfDifferentDigitsMin(numbers);


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

    /**
     * Упорядочивает и выводит числа в порядке возрастания значений их длины.
     *
     * @param numbers Массив чисел для анализа.
     */
    private static void printInAscendingOrder(String[] numbers) {
        boolean swapped = Boolean.parseBoolean("True");
        while (swapped) {
            swapped = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i].length() > numbers[i + 1].length() ||
                        (numbers[i].length() == numbers[i + 1].length() &&
                                Integer.parseInt(numbers[i]) > Integer.parseInt(numbers[i + 1]))) {
                    String temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    swapped = true;
                }
            }
        }


        System.out.println("В порядке возрастания: ");
        for (String num : numbers) {
            System.out.println(num);
        }
    }

    /**
     * Упорядочивает и выводит числа в порядке убывания значений их длины.
     *
     * @param numbers Массив чисел для анализа.
     */

    private static void printInDescendingOrder(String[] numbers) {
        boolean swapped = Boolean.parseBoolean("True");
        while (swapped) {
            swapped = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i].length() < numbers[i + 1].length() ||
                        (numbers[i].length() == numbers[i + 1].length() &&
                                Integer.parseInt(numbers[i]) < Integer.parseInt(numbers[i + 1]))) {
                    String temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    swapped = true;
                }
            }
        }


        System.out.println("В порядке убывания: ");
        for (String num : numbers) {
            System.out.println(num);
        }
    }

    /**
     * Выводит на консоль числа, длина которых меньше и больше средней, а также длину.
     *
     * @param numbers Массив чисел для анализа.
     */
    private static void printNumbersWithLengthComparison(String[] numbers) {
        double sum = 0;
        double average = 0;
        for (String num : numbers) {
            sum += num.length();
        }
        average = sum / numbers.length;
        System.out.println("Числа, длина которых меньше средней: ");
        for (String num : numbers) {
            if (num.length() < average) {
                System.out.println("Число:" + num + ", длинна: " + num.length());
            }
        }
        System.out.println("Числа, длина которых больше средней: ");
        for (String num : numbers) {
            if (num.length() > average) {
                System.out.println("Число:" + num + ", длинна: " + num.length());
            }
        }
    }

    /**
     * Выводит на консоль числа, в котором число различных цифр минимально. Если таких чисел несколько выводит первое из них.
     *
     * @param numbers Массив чисел для анализа.
     */

    private static void printNumberOfDifferentDigitsMin(String[] numbers) {
        String minNum = numbers[0];
        int temp = findMinNumber(minNum);
        for (int i = 0; i < numbers.length; i++){
            if(findMinNumber(numbers[i]) > temp) {
                minNum = numbers[i];

            }
        }
        System.out.println(minNum);


    }




    /**
     * Функция служит для выяснения какие цифры есть в числе.
     *
     * @param num  число для анализа.
     */


    private static int findMinNumber(String num) {
        int[] digitCount = new int[10];
        for (int i = 0; i < num.length(); i++) {
            char digitChar = num.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            digitCount[digit]++;
        }
        return numberOfRepetitionsOfDigits(digitCount);

    }

    /**
     * Функция служит для подсчета, того сколько повторяется самая повторяющаяся цифра.
     *
     * @param digitCount Массив чисел для анализа.
     */


    private static int numberOfRepetitionsOfDigits(int[] digitCount) {
        int maxDigit = 0;
        int countMaxRepeatNumber = 0;
        for (int i = 0; i < digitCount.length; i++) {
            if (digitCount[i] > countMaxRepeatNumber) {
                countMaxRepeatNumber = digitCount[i];
                maxDigit = i;
            }
        }
        return countMaxRepeatNumber;
    }


}




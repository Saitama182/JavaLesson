
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Ввести с консоли n целых чисел. На консоль вывести:
1. Четные и нечетные числа.
2. Числа, которые делятся на 3 и 9.
3. Числа, которые делятся на 5 и 7.
4. Наибольшее и наименьшее число.
5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
6. Простые числа.
7. Отсортированные числа в порядке убывания и возрастания.
8. Числа в порядке убывания частоты встречаемости чисел.
9. Счастливые числа.
10. Числа-палиндромы
11. Элементы, которые равны полусумме соседних элементов.
 */
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите количество чисел (n): ");
            int n = scanner.nextInt();
            int[] numbers = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Введите " + (i + 1) + " элемент массива");
                numbers[i] = scanner.nextInt();
            }

            System.out.println("Задание 1 - Четные и нечетные числа ");
            printEvenAndOdd(numbers);
            System.out.println();
            System.out.println("Задание 2 - Числа, которые делятся на 3 и 9 ");
            printDivisibleBy3And9(numbers);
            System.out.println();
            System.out.println("Задание 3 - Числа, которые делятся на 5 и 7 ");
            printDivisibleBy5And7(numbers);
            System.out.println();
            System.out.println("Задание 4 - Наибольшее и наименьшее число ");
            printMaxAndMin(numbers);
            System.out.println();
            System.out.println("Задание 5 - Все трехзначные числа, в десятичной записи которых нет одинаковых цифр ");
            printDistinctThreeDigitNumbers(numbers);
            System.out.println();
            System.out.println("Задание 6 - Простые числа ");
            printPrimeNumbers(numbers);
            System.out.println();
            System.out.println("Задание 7 - Отсортированные числа в порядке убывания и возрастания ");
            printSortedNumbers(numbers);
            System.out.println();
            System.out.println("Задание 8 - Числа в порядке убывания частоты встречаемости чисел ");
            printNumbersByFrequency(numbers);
            System.out.println();
            System.out.println("Задание 9 - Счастливые числа ");
            printHappyNumbers(numbers);
            System.out.println();
            System.out.println("Задание 10 - Числа-палиндромы ");
            printPalindromeNumbers(numbers);
            System.out.println();
            System.out.println("Задание 11 - Элементы, которые равны полусумме соседних элементов ");
            printHalfSumElements(numbers);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * Выводит на консоль четные и нечетные числа из массива.
     *
     * @param numbers Массив чисел для анализа.
     */

    private static void printEvenAndOdd(int[] numbers) {
        ArrayList<Integer> evenNumbersList = new ArrayList<>();
        ArrayList<Integer> oddNumbersList = new ArrayList<>();


        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbersList.add(number);
            } else {
                oddNumbersList.add(number);
            }
        }

        System.out.println("Четные числа: " + evenNumbersList);
        System.out.println("Нечетные числа: " + oddNumbersList);

    }

    /**
     * Выводит на консоль числа, которые делятся на 3 и 9 из массива.
     *
     * @param numbers Массив чисел для анализа.
     */

    private static void printDivisibleBy3And9(int[] numbers) {
        ArrayList<Integer> divisibleBy3And9List = new ArrayList<>();

        for (int number : numbers) {
            if (number % 3 == 0 && number % 9 == 0) {
                divisibleBy3And9List.add(number);
            }
        }
        System.out.println(divisibleBy3And9List);
    }

    /**
     * Выводит на консоль числа, которые делятся на 5 и 7 из массива.
     *
     * @param numbers Массив чисел для анализа.
     */

    private static void printDivisibleBy5And7(int[] numbers) {
        ArrayList<Integer> divisibleBy5And7List = new ArrayList<>();
        for (int number : numbers) {
            if (number % 5 == 0 && number % 7 == 0) {
                divisibleBy5And7List.add(number);
            }
        }
        System.out.println(divisibleBy5And7List);
    }

    /**
     * Выводит на консоль наибольшее и наименьшее число.
     *
     * @param numbers Массив чисел для анализа.
     */

    private static void printMaxAndMin(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];
        for (int j = 0; j < numbers.length; j++) {
            if (max < numbers[j]) {
                max = numbers[j];
            }
            if (min > numbers[j]) {
                min = numbers[j];
            }
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
    }

    /**
     * Выводит на консоль все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
     *
     * @param numbers Массив чисел для анализа.
     */

    private static void printDistinctThreeDigitNumbers(int[] numbers) {
        ArrayList<Integer> distinctThreeDigitNumbersList = new ArrayList<>();
        for (int number : numbers) {
            if (isDistinctThreeDigitNumbers(number)) {
                distinctThreeDigitNumbersList.add(number);
            }
        }
        System.out.println(distinctThreeDigitNumbersList);
    }

    private static boolean isDistinctThreeDigitNumbers(int number) {
        int a = number % 10;
        int b = (number / 10) % 10;
        int c = number / 100;
        return a != b && a != c && b != c;

    }

    /**
     * Выводит на консоль простые числа.
     *
     * @param numbers Массив чисел для анализа.
     */

    private static void printPrimeNumbers(int[] numbers) {
        ArrayList<Integer> primeNumbersList = new ArrayList<>();
        for (int number : numbers) {
            if (isPrime(number)) {
                primeNumbersList.add(number);
            }
        }
        System.out.println(primeNumbersList);

    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Выводит на консоль отсортированные числа в порядке убывания и возрастания.
     *
     * @param numbers Массив чисел для анализа.
     */

    private static void printSortedNumbers(int[] numbers) {
        int[] sortedNumbersAsc = sortNumbersAsc(numbers);
        int[] sortedNumbersDesc = sortNumbersDesc(Arrays.copyOf(numbers, numbers.length));

        ArrayList<Integer> sortedNumbersAscList = new ArrayList<>();
        ArrayList<Integer> sortedNumbersDescList = new ArrayList<>();

        for (int num : sortedNumbersAsc) {
            sortedNumbersAscList.add(num);
        }

        for (int num : sortedNumbersDesc) {
            sortedNumbersDescList.add(num);
        }

        System.out.println("В порядке возрастания: " + sortedNumbersAscList);
        System.out.println("В порядке убывания: " + sortedNumbersDescList);
    }

    private static int[] sortNumbersAsc(int[] numbers) {
        boolean arrayIsNotSorted = true;
        while (arrayIsNotSorted) {
            arrayIsNotSorted = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    arrayIsNotSorted = true;
                }
            }
        }
        return numbers;
    }

    private static int[] sortNumbersDesc(int[] numbers) {
        boolean arrayIsNotSorted = true;
        while (arrayIsNotSorted) {
            arrayIsNotSorted = false;
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > numbers[i - 1]) {
                    int temp = numbers[i - 1];
                    numbers[i - 1] = numbers[i];
                    numbers[i] = temp;
                    arrayIsNotSorted = true;
                }
            }
        }
        return numbers;
    }

    /**
     * Выводит на консоль числа в порядке убывания частоты встречаемости чисел.
     *
     * @param numbers Массив чисел для анализа.
     */

    private static void printNumbersByFrequency(int[] numbers) {
        int[] count = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            count[i] = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count[i]++;
                }
            }
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (count[i] < count[j] || (count[i] == count[j] && numbers[i] < numbers[j])) {
                    int tempCount = count[i];
                    count[i] = count[j];
                    count[j] = tempCount;
                    int tempNum = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tempNum;
                }
            }
        }

        System.out.println("Числа из массива" + "\t" + "Сколько раз встречается");
        for (int i = 0; i < numbers.length; i += count[i]) {
            System.out.println(numbers[i] + "\t\t\t\t\t" + count[i]);
        }
    }

    /**
     * Выводит на консоль счастливые числа.
     *
     * @param numbers Массив чисел для анализа.
     */

    private static void printHappyNumbers(int[] numbers) {
        ArrayList<Integer> happyNumbersList = new ArrayList<>();
        for (int number : numbers) {
            if (isHappyNumbers(number)) {
                happyNumbersList.add(number);
            }
        }
        System.out.println(happyNumbersList);
    }

    private static boolean isHappyNumbers(int number) {
        String strNum = String.valueOf(number);
        int length = strNum.length();
        if (length % 2 != 0) {
            return false;
        }
        int originalNumber = number;
        int firstHalf = 0;
        int secondHalf = 0;
        for (int i = 0; i < length / 2; i++) {
            int digit = number % 10;
            firstHalf += digit;
            number = number / 10;

        }

        for (int i = length / 2; i > 0; i--) {
            int digit = number % 10;
            secondHalf += digit;
            number = number / 10;

        }
        return firstHalf == secondHalf;

    }

    /**
     * Выводит на консоль числа-палиндромы.
     *
     * @param numbers Массив чисел для анализа.
     */

    private static void printPalindromeNumbers(int[] numbers) {
        ArrayList<Integer> palindromeNumbersList = new ArrayList<>();
        for (int number : numbers) {
            if (isPalindromeNumbers(number)) {
                palindromeNumbersList.add(number);
            }
        }
        System.out.println(palindromeNumbersList);
    }

    private static boolean isPalindromeNumbers(int number) {

        int rev = 0;
        int originalNumber = number;
        String strNum = String.valueOf(number);
        int length = strNum.length();
        for (int i = 0; i < length; i++) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number = number / 10;

        }

        return originalNumber == rev;

    }

    /**
     * Выводит на консоль элементы, которые равны полусумме соседних элементов.
     *
     * @param numbers Массив чисел для анализа.
     */

    private static void printHalfSumElements(int[] numbers) {
        ArrayList<Integer> halfSumElementsList = new ArrayList<>();
        int n = numbers.length;

        for (int i = 1; i < n - 1; i++) {
            if (ishalfSumElements(numbers, i)) {
                halfSumElementsList.add(numbers[i]);
            }
        }

        System.out.println(halfSumElementsList);
    }

    private static boolean ishalfSumElements(int[] numbers, int i) {
        int n = numbers.length;
        if (numbers[i] == (numbers[i - 1] + numbers[i + 1]) / 2) {
            return true;
        }
        return false;
    }
}
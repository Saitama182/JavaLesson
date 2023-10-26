
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел (n): ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Введите " + (i + 1) + " элемент массива");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Задание 1)");
        printEvenAndOdd(numbers);

        scanner.close();
    }

    private static void printEvenAndOdd(int[] numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();


        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }

        System.out.println("Четные числа: " + evenNumbers);
        System.out.println("Нечетные числа: " + oddNumbers);

    }



/*

        System.out.println("\nЗадание 2)");
        System.out.print("Делятся на 3 и 9: ");
        for (int number : numbers) {
            if (number % 3 == 0 && number % 9 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println("\nЗадание 3)");
        System.out.print("Делятся на 5 и 7: ");
        for (int number : numbers) {
            if (number % 5 == 0 && number % 7 == 0) {
                System.out.print(number + " ");
            }
        }

        System.out.println("\nЗадание 4)");
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
        System.out.println("\nЗадание 5)");
        System.out.println("трехзначные числа, в десятичной записи которых нет одинаковых цифр: ");
        for (int number : numbers) {
            int a = number % 10;
            int b = (number / 10) % 10;
            int c = number / 100;
            if (a != b && a != c && b != c) {
                System.out.print(number + " ");
            }
        }
        System.out.println("\nЗадание 6)");
        System.out.println("Простые числа :");
        for (int number : numbers) {
            boolean primeNumber = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {

                if (number % i == 0) {
                    primeNumber = false;
                    break;
                }
            }
            if (primeNumber) {
                System.out.print(number + " ");
            }
        }

        System.out.println("\nЗадание 7)");
        String arrayAsString = Arrays.toString(numbers);
        System.out.println("Заданный массив : " + arrayAsString);
        for (int number : numbers) {
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
        }
        System.out.println("В порядке возрастания: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        for (int number : numbers) {
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
        }
        System.out.println("\nВ порядке убывания: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nЗадание 8)");

        int[] count = new int[n];

        for (int i = 0; i < n; i++) {
            count[i] = 0;
            for (int j = 0; j < n; j++) {
                if (numbers[i] == numbers[j]) {
                    count[i]++;
                }
            }
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
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
        for (int i = 0; i < n; i += count[i]) {
            System.out.println(numbers[i] + "\t\t\t\t\t" + count[i]);
        }


        System.out.println("\nЗадание 9)");
        for (int number : numbers) {
            String strNum = String.valueOf(number);
            int length = strNum.length();
            if (length % 2 != 0) {
                continue;
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
            if (firstHalf == secondHalf) {
                System.out.println("Число счастливое " + originalNumber);
            }

        }

        System.out.println("\nЗадание 10)");

        for (int number : numbers) {
            int rev = 0;
            int originalNumber = number;
            String strNum = String.valueOf(number);
            int length = strNum.length();
            for (int i = 0; i < length; i++) {
                int digit = number % 10;
                rev = rev * 10 + digit;
                number = number / 10;

            }
            if (originalNumber == rev) {
                System.out.println("Число-палиндром: " + originalNumber);
            }

        }

        System.out.println("\nЗадание 11)");
        System.out.println("Элементы, которые равны полусумме соседних элементов:");
        for (int i = 1; i < n - 1; i++) {
            if (numbers[i] == (numbers[i - 1] + numbers[i + 1]) / 2) {
                System.out.print(numbers[i] + " ");
            }

        }
*/


}
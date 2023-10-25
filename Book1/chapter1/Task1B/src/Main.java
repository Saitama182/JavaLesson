
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
        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество чисел (n): ");
        int n = s.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Введите " + (i + 1) + " элемент массива");
            num[i] = s.nextInt();
        }
        s.close();

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int j = 0; j < num.length; j++) {
            if (num[j] % 2 == 0) {
                evenNumbers.add(num[j]);
            } else {
                oddNumbers.add(num[j]);
            }
        }
        System.out.println("Задание 1)");
        System.out.println("Четные числа: ");
        for (int number : evenNumbers) {
            System.out.print(number + " ");
        }
        System.out.println("\nНе четные числа: ");
        for (int number : oddNumbers) {
            System.out.print(number + " ");
        }
        System.out.println("\nЗадание 2)");
        System.out.print("Делятся на 3 и 9: ");
        for (int number : num) {
            if (number % 3 == 0 && number % 9 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println("\nЗадание 3)");
        System.out.print("Делятся на 5 и 7: ");
        for (int number : num) {
            if (number % 5 == 0 && number % 7 == 0) {
                System.out.print(number + " ");
            }
        }

        System.out.println("\nЗадание 4)");
        int max = num[0];
        int min = num[0];
        for (int j = 0; j < num.length; j++) {
            if (max < num[j]) {
                max = num[j];
            }
            if (min > num[j]) {
                min = num[j];
            }
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
        System.out.println("\nЗадание 5)");
        System.out.println("трехзначные числа, в десятичной записи которых нет одинаковых цифр: ");
        for (int number : num) {
            int a = number % 10;
            int b = (number / 10) % 10;
            int c = number / 100;
            if (a != b && a != c && b != c) {
                System.out.print(number + " ");
            }
        }
        System.out.println("\nЗадание 6)");
        System.out.println("Простые числа :");
        for (int number : num) {
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
        String arrayAsString = Arrays.toString(num);
        System.out.println("Заданный массив : " + arrayAsString);
        for (int number : num) {
            boolean arrayIsNotSorted = true;
            while (arrayIsNotSorted) {
                arrayIsNotSorted = false;
                for (int i = 0; i < num.length - 1; i++) {
                    if (num[i] > num[i + 1]) {
                        int temp = num[i];
                        num[i] = num[i + 1];
                        num[i + 1] = temp;
                        arrayIsNotSorted = true;
                    }
                }
            }
        }
        System.out.println("В порядке возрастания: ");
        for (int number : num) {
            System.out.print(number + " ");
        }
        for (int number : num) {
            boolean arrayIsNotSorted = true;
            while (arrayIsNotSorted) {
                arrayIsNotSorted = false;
                for (int i = 1; i < num.length; i++) {
                    if (num[i] > num[i - 1]) {
                        int temp = num[i - 1];
                        num[i - 1] = num[i];
                        num[i] = temp;
                        arrayIsNotSorted = true;
                    }
                }
            }
        }
        System.out.println("\nВ порядке убывания: ");
        for (int number : num) {
            System.out.print(number + " ");
        }

        System.out.println("\nЗадание 8)");

        int[] count = new int[n];

        for (int i = 0; i < n; i++) {
            count[i] = 0;
            for (int j = 0; j < n; j++) {
                if (num[i] == num[j]) {
                    count[i]++;
                }
            }
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (count[i] < count[j] || (count[i] == count[j] && num[i] < num[j])) {
                    int tempCount = count[i];
                    count[i] = count[j];
                    count[j] = tempCount;
                    int tempNum = num[i];
                    num[i] = num[j];
                    num[j] = tempNum;
                }
            }
        }

        System.out.println("Числа из массива" + "\t" + "Сколько раз встречается");
        for (int i = 0; i < n; i += count[i]) {
            System.out.println(num[i] + "\t\t\t\t\t" + count[i]);
        }


        System.out.println("\nЗадание 9)");
        for (int number : num) {
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

        for (int number : num) {
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
            if (num[i] == (num[i - 1] + num[i + 1]) / 2) {
                System.out.print(num[i] + " ");
            }

        }


    }
}
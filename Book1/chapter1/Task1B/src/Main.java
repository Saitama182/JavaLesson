import java.sql.SQLOutput;
import java.util.ArrayList;
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

        System.out.println("\nЗадание 7)");
    }
}
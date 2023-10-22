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
        for (int i = 0; i < num.length; i++ ){
            System.out.println("Введите " + (i + 1) + " элемент массива");
            num[i] = s.nextInt();
        }
        s.close();

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        System.out.print ("Число: ");
        for (int j=0; j < num.length; j++) {
            if (num[j] % 2 == 0) {
                System.out.print(" четное - ");
                System.out.print(num[j] + " ");
            } else {
                System.out.print(" не четное - ");
                System.out.print(num[j] + " ");
            }
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[][] sqrs = {
                {1, 1},
                {2, 4},
                {3, 9},
                {4, 16},
                {5, 25},
                {6, 36},
                {7, 49},
                {8, 64},
                {9, 81},
                {10, 100}
        };
        while (true) {
            System.out.println("Введите число от 1 до 10");
            int a = s.nextInt();

            if (a > 0 && a < 11) {
                System.out.println("Вы ввели " + a);
                for (int i = 0; i < sqrs.length; i++) {
                    if (sqrs[i][0] == a) {
                        System.out.println("Квадратный корень этого числа: " + sqrs[i][1]);
                    }
                }
            } else {
                System.out.println("Вы ввели неправильное число");
                break;
            }
        }
    }
}
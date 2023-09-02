import java.util.Scanner;

// решить задачу № 2 спомощью цикла while
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("Вы ввели а = " + a + " b = " + b);
        int j = a + 1;
        while (j < b) {
            if (j % 5 == 0 && j % 10 != 0) {
                System.out.print(j + " ");
            }
            j++;
        }
    }
}
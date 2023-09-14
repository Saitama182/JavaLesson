import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите что нибудь");
        String string = s.nextLine();
        System.out.println(" Вы ввели " + string);
        int n = s.nextInt();
        System.out.println(" Вы ввели " + n);
    }
}
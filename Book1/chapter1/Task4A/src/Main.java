import java.util.Scanner;

/*
Ввести пароль из командной строки и сравнить его со строкой образцом.
 */
public class Main {
    public static void main(String[] args) {
        String password = "qwerty123";
        Scanner s = new Scanner(System.in);
        System.out.println("Введите пароль ");
        String enterPassword = s.nextLine();
        if (enterPassword.equals(password)) {
            System.out.println("пароль совпадает");
        } else {
            System.out.println("пароль не совпадает");
        }
        s.close();

    }
}
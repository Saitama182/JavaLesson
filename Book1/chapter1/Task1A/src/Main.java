/*
Приветствовать любого пользователя при вводе его имени через командную строку
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = s.next();
        System.out.println("Привет " + name);
        s.close();
    }
}
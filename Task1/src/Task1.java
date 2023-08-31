/**
 * Вывести на экран слово Java в строку чтобы оно повторилось 10 раз, используя цикл while.
 * Вывод в консоль должен быть таким: Java Java Java Java Java Java Java Java Java Java
 */

public class Task1 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.print("Java ");
            i++;
        }
    }
}
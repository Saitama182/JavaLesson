import java.util.Random;

/*
Вывести заданное кол-во случайных чисел с переходом и без перехода на новую строку
 */
public class Main {
    public static void main(String[] args) {
        int count = 4;
        Random r = new Random();
        System.out.println("с переходом");
        for (int i = 0; i< count; i++){
            System.out.println(r.nextInt());
        }
        System.out.println("без перехода");
        for (int j = 0; j< count; j++){
            System.out.print(r.nextInt() + " ");

        }

    }
}
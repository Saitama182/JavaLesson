import java.util.Random;

/**
 * Создать и заполнить массив длиной 100 элементов, случайными числами от 0 до 10000.
 * Найти максимум среди сумм трех соседних элементов.
 * Для найденной тройки с максимальной суммой выведите значение суммы и индекс первого элемента тройки
 */

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);

        }
        int maxSum = 0;
        int maxSumid = 0;
        for (int i = 0; i < arr.length - 2 ; i++) {
            int sum = 0;
            for(int j = i; j < i+2; j++) {
                sum = arr[j];

            }

            if (maxSum < sum) {
                maxSum = sum;
                maxSumid = i;
            }

        }

        System.out.println("максимум среди сумм трех соседних элементов " + maxSum);
        System.out.println("индекс первого элемента тройки  " + maxSumid);


    }
}
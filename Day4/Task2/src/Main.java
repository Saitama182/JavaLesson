import java.util.Arrays;
import java.util.Random;

/**
 * Создать и заполнить массив длинной 100 элементов, случайными числами от 0 до 10000
 * и с помощью цикла for each вывести информацию о наибольшем и наименьшем элементе массива,
 * кол-ве элементов оканчивающихся на 0, сумме элементов оканчивающихся на 0.
 * Использовать сортировку запрещено.
 */

public class Main {
    public static void main(String[] args) {
        int [] array = new int[100];
        Random random = new Random();

        for(int i = 0; i<array.length;i++ ){
            array[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(array));

        int max = array[0];
        int min = array[0];
        for (int x:array) {
            if (x > max){
                max = x;
            } else if (x < min) {
                min = x;
            }

        }
        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива: " + min);

        int countZero = 0;
        int sum = 0;
        for (int y:array) {
            if (y % 10 == 0) {
                countZero++;
                sum = sum + y;
            }
        }
        System.out.println("кол-вo элементов оканчивающихся на 0: "+ countZero);
        System.out.println("cумма элементов оканчивающихся на 0: "+ sum);

    }
}
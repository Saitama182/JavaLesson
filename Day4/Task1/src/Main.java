import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * C клавиатуры вводится количество элементов в массиве.
 * Создать массив указанной длины , заполнитьь его случайными числами от 0 до 10.
 * Распечатать массив , а так же вывести в консоль информацию о
 * 1) Длинне массива
 * 2) Количестве чисел больше 8
 * 3) Количестве чисел равных 1
 * 4) Количестве четных чисел
 * 5) Колличестве нечетных чисел
 * 6) Сумме всех элементов массива
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива ");
        int arrLength = scanner.nextInt();
        int[] numbersArray = new int[arrLength];
        Random random = new Random();

        for (int i = 0; i < numbersArray.length; i++)
            numbersArray[i] = random.nextInt(10);

        System.out.println(Arrays.toString(numbersArray));
        System.out.println("Длинна массива: " + numbersArray.length);

        int moreThanEight = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] > 8) {
                moreThanEight++;
            }
        }
        System.out.println("Количество чисел больше 8: " + moreThanEight);

        int moreThanOne = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] == 1) {
                moreThanOne++;
            }
        }
        System.out.println("Количество чисел равных 1: " + moreThanOne);

        int even = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i]% 2  == 0) {
                even++;
            }
        }
        System.out.println("Количество четных чисел: " + even);


        System.out.println("Количество нечетных чисел: " + (arrLength - even));

        int sum = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            sum += numbersArray[i] ;
        }
        System.out.println("Суммa всех элементов массива: "+ sum);


    }
}
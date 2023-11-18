import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        String number = s.nextLine();
        findMinNumber(number);
    }

    private static void findMinNumber(String number) {
        int[] digitCount = new int[10];
        for (int i = 0; i < number.length(); i++) {
            char digitChar = number.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            digitCount[digit]++;
        }
        System.out.println(Arrays.toString(digitCount));
        meMe(digitCount);
    }

    private static void meMe(int[] digitCount) {
        int maxDigit = 0;
        int countMaxRepeatNumber = 0;
        for (int i = 0; i < digitCount.length; i++) {
            if (digitCount[i] > countMaxRepeatNumber) {
                countMaxRepeatNumber = digitCount[i];
                maxDigit = i;
            }
        }
        System.out.println("Цифра с максимальным количеством повторений: " + maxDigit);
        System.out.println("Кол-во повторений " + countMaxRepeatNumber);
    }
}
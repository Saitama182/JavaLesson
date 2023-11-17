import java.sql.SQLOutput;
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
        int count = 0;
        for (int i = 0; i < digitCount.length; i++) {
            boolean isUnique = true;
            for(int j =0; j< i; j++){
                if(digitCount[i] == digitCount[i]){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                count++;
            }
        }
        System.out.println(count);
    }


}
/*
Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350.Вывести список.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        for(int i = 0; i< 31; i++){
            if(i % 2 == 0){
                list1.add(i);
            }
        }
        for(int i = 300; i< 351; i++){
            if(i % 2 == 0){
                list1.add(i);
            }
        }
        System.out.println(list1);
    }
}
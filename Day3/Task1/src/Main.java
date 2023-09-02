/**
 * Реализовать программу, которая в консоль выводит название страны, принимая на вход назание города.
 * Программа должна работать до тех пор, пока не будет введено слово Stop.
 * Москва, Владивосток, Ростов - Россия.
 * Рим, Милан, Турин - Италия.
 * Ливерпуль, Манчестер, Лондон - Англия.
 * Берлин, Мюнхен, Кельн  - Германия.
 * При вводе другого города - Неизвестная странаю
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the city");
            String city = scanner.nextLine();
            if (city.equals("Москва") || city.equals("Владивосток") || city.equals("Ростов")) {
                System.out.println("Россия");
            } else if (city.equals("Рим") || city.equals("Милан") || city.equals("Турин")) {
                System.out.println("Италия");
            } else if (city.equals("Берлин") || city.equals("Мюнхен") || city.equals("Кельн")) {
                System.out.println("Германия");
            } else if (city.equals("Ливерпуль") || city.equals("Манчестер") || city.equals("Лондон")) {
                System.out.println("Англия");
            } else if (city.equals("stop")) {
                break;
            } else {
                System.out.println("Неизвестная страна");
            }
        }
    }
}
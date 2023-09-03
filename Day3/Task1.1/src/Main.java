import java.util.Scanner;

/**
 * Реализовать программу, которая в консоль выводит название страны, принимая на вход назание города.
 * Программа должна работать до тех пор, пока не будет введено слово Stop.
 * Москва, Владивосток, Ростов - Россия.
 * Рим, Милан, Турин - Италия.
 * Ливерпуль, Манчестер, Лондон - Англия.
 * Берлин, Мюнхен, Кельн  - Германия.
 * При вводе другого города - Неизвестная странаю
 */


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the city");
            String city = scanner.nextLine();

            if (city.equals("stop")){
                break;
            }
            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;


                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;



                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;



                case "Берлин":
                case "Мюнхен":
                case "Кельн":
                    System.out.println("Германия");
                    break;

                default:
                    System.out.println("Неизвестная странаю");

            }


        }

    }
}
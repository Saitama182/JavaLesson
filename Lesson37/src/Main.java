import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        File file = new File("fil9з9зe");
        try {
            Scanner scanner = new Scanner(file);

            System.out.println("после Scanner'a");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");;
        }
        System.out.println("После блока try catch");

    }


}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter name and press <Enter> & number and press <Enter>: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello, " + name);
        int num = scan.nextInt();
        System.out.println("number = " + num);
        scan.close();

    }
}
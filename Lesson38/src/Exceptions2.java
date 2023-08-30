import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int x = Integer.parseInt(scanner.nextLine());
                if (x != 0) {
                    throw new ScannerException("Input must be 0");
                }
            } catch (ScannerException ex) {
                System.out.println("ScannerException caught: " + ex.getMessage());
            }
        }
    }
}

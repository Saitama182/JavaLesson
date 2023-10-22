import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int x;
        try {
            x = System.in.read();
            char c = (char)x;
            System.out.println("Character Code: " + c + " = " + x);
        } catch (IOException e) {
            System.err.println("i\0 error " + e);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        String arg = "42";
        try {
            int value1 = Integer.parseInt(arg);
            Integer value2 = Integer.valueOf(arg);
            Integer value3 = Integer.decode(arg);
            System.out.println(value1 + " " + value2 + " " + value3 );

        } catch (NumberFormatException e) {
            System.err.println("Invalid number format: " + arg + " : " + e);
        }
    }
}
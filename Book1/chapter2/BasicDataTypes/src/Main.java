public class Main {
    public static void main(String[] args) {
        int a = 42;
        long b  = 2147483648L;
        int c = 4_200_000;
        double d = 0.11D;
        float e = 0.123F;
        int number = 42;
        byte value = (byte) number;

        var counter = 1;
        System.out.println(counter);

        int b1 = 0b1110;
        System.out.println(b1);
        int b2 = 0b1001;
        System.out.println(b2);
        int i =0;
        System.out.println(b1 + "|" + b2 + " = " + (b1|b2));
        System.out.println(b1 + "&" + b2 + " = " + (b1&b2));
        System.out.println( "~" + b2 + " = " + ~b2);
        System.out.println( b1 + ">>" + ++i + " = " + (b1>>i));
        System.out.println( b1 + "<<" + i + " = " + (b1<<i++));
        System.out.println( b1 + ">>>" + i + " = " + (b1>>>i));




    }
}
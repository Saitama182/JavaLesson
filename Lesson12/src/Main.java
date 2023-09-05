public class Main {
    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "hi";
        strings[1] = "my";
        strings[2] = "is";

        for (String string:strings) {
            System.out.println(string);
        }
        int[] nums = {1,2,3};
        int sum = 0;
        for(int x:nums) {
            sum=sum+x;
        }
    }
}
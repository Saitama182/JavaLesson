public class Main {
    public static void main(String[] args) {

        TestRole test1 = new TestRole();
        int adminLevel = test1.defineLevel("admin");
        System.out.println(adminLevel);
        int adminLevel2 = test1.defineLevel("moderator");
        System.out.println(adminLevel2);
        int adminLevel3 = test1.defineLevel("moderator");
        System.out.println(adminLevel3);
    }
}
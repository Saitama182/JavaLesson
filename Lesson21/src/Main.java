public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Bob", 12);
        Human h2 = new Human("Jack", 33);
        Human.description = "Nice";
        h1.getAll();
        h2.getAll();
        Human.description = "Bad";
        h1.getAll();
        h2.getAll();
    }
}
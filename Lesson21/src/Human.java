public class Human {
    private String name;
    private int age;

    public static String description;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void getAll(){
        System.out.println(name +" , " + age + " , " + description );
    }
}

public class Person {
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()){
            System.out.println("Ты ввел пустое имя ");
        } else {
            name = userName;
        }

    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0){
            System.out.println("Возраст должен быть положительным");
        } else {
            age = userAge;
        }

    }

    public int getAge() {
        return age;
    }
}

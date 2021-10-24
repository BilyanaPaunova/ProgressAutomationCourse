package homework6.exercises;

public class Person {

    private String name;
    private int age;
    private boolean isMan;

    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    public String getName() {
        return name;
    }
//    public void setName(String name) {
//        this.name = name;
//    }
    public int getAge() {
        return age;
    }
//    public void setAge(int age) {
//        this.age = age;
//    }
//    public boolean isMan() {
//        return isMan;
//    }
//    public void setMan(boolean isMan) {
//        this.isMan = isMan;
//    }

    public void showPersonInfo() {
        System.out.println("Person's name is: " + name);
        System.out.println("Person's age is: " + age);
        if (isMan) {
            System.out.println("The person is male");
        } else {
            System.out.println("The person is female");
        }
    }
}

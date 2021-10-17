package homework6.exercises;

public class Student extends Person{
    private double score;

    public Student(String name, int age, boolean isMan, double score) {
        // call constructor of the superclass
        super(name, age, isMan);
        this.score = score;
    }

    public void showStudentInfo(){
        //call method of the superclass
        showPersonInfo();
        System.out.println("The student's score is: " + score);
    }
}

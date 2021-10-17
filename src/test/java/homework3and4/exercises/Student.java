package homework3and4.exercises;

public class Student {
    public String name;
    public String subject;
    public int grade;
    public int yearInCollage;
    public int age;
    public boolean isDegree;
    public double money;


    public Student() {
        grade = 3;
        yearInCollage = 1;
        isDegree = false;
        money = 0.0;
    }

    public Student(String name, String subject, int age) {
        this();
        this.name = name;
        this.subject = subject;
        this.age = age;
    }

    public void upYear() {
        if (yearInCollage <= 4) {
            System.out.println("The student has a degree");
            yearInCollage++;
        }
        if (yearInCollage > 4) {
            isDegree = true;
        }
    }


    public double receiveScholarship(double min, double amount) {
            if (grade >= min && age < 33) {
                //money = money + amount;
                money += amount;
            }
            return money;
    }

}

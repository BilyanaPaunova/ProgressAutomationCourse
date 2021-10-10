package homework3;

import homework3.exercises.Student;

public class StudentDemo {
    public static void main(String[] args) {

        Student bibs = new Student("Bibs", "AutomationTesting", 30);
        System.out.println("Bibs initial year in college: " + bibs.yearInCollage);
        bibs.upYear();
        System.out.println("Bibs current year in college: " + bibs.yearInCollage);
        System.out.println("Bibs money before scholarship: " + bibs.money);
        bibs.receiveScholarship(2, 900.2);
        System.out.println("Bibs money after scholarship: " + bibs.money);

    }
}

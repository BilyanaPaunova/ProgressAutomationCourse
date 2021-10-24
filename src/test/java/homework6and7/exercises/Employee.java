package homework6and7.exercises;

public class Employee extends Person{
    private static final int MINIMUM_OVERTIME_AGE = 18;
    private static final double OVERTIME = 1.5;

    private final double daySalary;

    public Employee(String name, int age, boolean isMan, double daySalary) {
        // call constructor of the superclass
        super(name, age, isMan);
        this.daySalary = daySalary;
    }

    public double calculateOvertime(double hours) {
        if(getAge() < MINIMUM_OVERTIME_AGE) {
            return 0;
        } else {
            return hours * OVERTIME * calculateDaySalary(daySalary);
        }
    }
    public double calculateDaySalary(double daySalary) {
        if (daySalary > 0.0) {
            daySalary = daySalary / 8;
        } else {
            System.out.println("Incorrectly calculated salary");
        }
        return daySalary;
    }
    public void showEmployeeInfo() {
        showPersonInfo();
        System.out.println("Employee's day salary is: " + daySalary);
    }
}

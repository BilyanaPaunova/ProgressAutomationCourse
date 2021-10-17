package homework6;

import homework6.exercises.*;

public class ExercisesRunner {

    public static void main(String[] args) {
        Person[] persons = new Person[10];

        Person bibs = new Person("Bilyana", 33, false);
        Person pesho = new Person("Pesho", 25, true);
        Student pavel = new Student("Pavel", 14, true, 5.5);
        Student misho = new Student("Mihail", 15, true, 4.5);
        Employee ceco = new Employee("Cvetan", 16, true, 1200.5);
        Employee petya = new Employee("Petya", 24, false, 3500.5);

        persons[0] = petya;
        persons[1] = misho;
        persons[2] = ceco;
        persons[3] = bibs;
        persons[4] = pesho;
        persons[5] = pavel;

        System.out.println("---------Show Info---------");

        for (Person person : persons) {
            if (person instanceof Student) {
                System.out.println("---------The Person is a Student---------");
                ((Student) person).showStudentInfo();
                continue;
            }
            if (person instanceof Employee) {
                System.out.println("---------The Person is an Employee---------");
                ((Employee) person).showEmployeeInfo();
                continue;
            }
            if (person != null) {
                System.out.println("---------The Person is a regular Person---------");
                person.showPersonInfo();

            } else {
                System.out.println("---------No Person in the list---------");
            }

        }

        System.out.println("---------Show Overtime---------");

        for (Person person : persons) {
            if (person instanceof Employee) {
                double overtime = ((Employee) person).calculateOvertime(2);
                System.out.println(person.name + "'s overtime salary is " + overtime);
            }
        }
    }
}

package homework2.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

//    Задача 6: Да се прочете число от екрана(конзолата) и да се изведе сбора на всички
//    числа между 1 и въведеното число.
public class Exercise6 {

    public static void runExercise6() {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Input number:");
            int number = sc.nextInt();

            int sum = 0;
            for (int i = 1; i <= number; i++) {
                sum = sum + i;
            }
            System.out.println("Sum = " + sum);

            // check if a data input error occurs
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}

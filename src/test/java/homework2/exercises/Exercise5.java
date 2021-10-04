package homework2.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

// Задача 5: Да се въведат от потребителя 2 числа. И да се изведат на екрана всички
//числа от по-малкото до по-голямото.
public class Exercise5 {

    public static void runExercise5() {

        try (Scanner sc = new Scanner(System.in)) {
            int highest = 0;
            int lowest = 0;
            System.out.println("Input first number:");
            int first = sc.nextInt();
            System.out.println("Input second number:");
            int second = sc.nextInt();


            if (first > second) {
                highest = first;
                lowest = second;
            } else if (first == second) {
                System.out.println("Values are equal: " + first);
            } else {
                highest = second;
                lowest = first;
            }

            for (int i = lowest; i <= highest; i++) {
                System.out.print(i + " ");
            }

            // check if a data input error occurs
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}


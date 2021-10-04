package homework2.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

//      Задача 8: По зададено число n, да се изведе на екрана таблица по
//      следния начин:

public class Exercise8 {

    public static void runExercise8() {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Input number n value:");
            int n = sc.nextInt();

            int counter = n-1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(counter + " ");
                }
                System.out.println();
                counter = counter + 2;

            }

            // check if a data input error occurs
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}


package homework2.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

//    Задача 7: Започвайки от 3, да се изведат на екрана първите n числа които се делят
//    на 3. Числата да са разделени със запетая.
public class Exercise7 {

    public static void runExercise7() {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Input number n value:");
            int n = sc.nextInt();

            int counter = 0;
            for (int i = 3; i <= n; i++) {
                if (i == 3) {
                    System.out.print(i);
                } else if (i % 3 == 0) {
                    System.out.print("," + i);
                    counter++;
                }

                if (counter == n) {
                    break;
                }
            }

            // check if a data input error occurs
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}

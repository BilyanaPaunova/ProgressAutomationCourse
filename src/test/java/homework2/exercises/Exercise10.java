package homework2.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

//        Задача 10: Въведете число от клавиатурата и определете дали е просто. Просто
//        число е това което се дели САМО на 1 и на себе си

public class Exercise10 {

    public static void runExercise10() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Input number value:");
            int number = sc.nextInt();

            boolean isPrime = true;

            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number + " is a prime number");
            } else {
                System.out.println(number + " is not a prime number");
            }

            // check if a data input error occurs
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}

package homework2.exercises;

//        Задача 9: Да се прочетат 2 числа от клавиатурата А и В. Да се изведат всички
//        числа от А до В на степен 2(разделени с запетая). Ако някое число е кратно на 3, да
//        се изведе съобщение че числото се пропуска „skip 3“. Ако сумата от всички
//        изведени числа (без пропуснатите) стане по-голяма от 200, да се прекрати
//        извеждането.

import java.util.InputMismatchException;
import java.util.Scanner;

//    Задача 9: Да се прочетат 2 числа от клавиатурата А и В. Да се изведат всички
//    числа от А до В на степен 2(разделени с запетая). Ако някое число е кратно на 3, да
//    се изведе съобщение че числото се пропуска „skip 3“. Ако сумата от всички
//    изведени числа (без пропуснатите) стане по-голяма от 200, да се прекрати
//    извеждането.
public class Exercise9 {

    public static void runExercise9() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Input number A value:");
            int a = sc.nextInt();
            System.out.println("Input number B value:");
            int b = sc.nextInt();

            if (a > b) {
                int counter = b;
                b = a;
                a = counter;
            }
            int sum = 0;
            for (int i = a; i <= b; i++) {
                if (i % 3 != 0) {
                    System.out.print(i * i);
                    sum = sum + i * i;
                } else {
                    System.out.print("skip, " + i);
                }
                if (sum > 200)
                    break;
                System.out.print(", ");
            }

            // check if a data input error occurs
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}

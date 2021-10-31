package homework10.exercises;

import java.util.*;

public class Exercise1 {

    public static void runExercise1() {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> number = new ArrayList<>();

        System.out.println("Insert an int number to add to the Collection: ");

        while (sc.hasNextInt()) {
            int i = sc.nextInt();
            number.add(i);
        }

        Iterator<Integer> iterator = number.iterator();
        int minimumNumber = number.get(0);
        boolean isNumberMultiplesByThree = false;

        while (iterator.hasNext()) {
            int temp = iterator.next();
            if (temp % 3 == 0 && minimumNumber % 3 != 0 || temp < minimumNumber) {
                isNumberMultiplesByThree = true;
                minimumNumber = temp;
            }
        }
        if (!isNumberMultiplesByThree && (minimumNumber % 3 != 0)) {
            System.out.println("There are no number multiples by three");
        } else {
            System.out.println("The minimum number multiples by three is " + minimumNumber);
        }
    }
}
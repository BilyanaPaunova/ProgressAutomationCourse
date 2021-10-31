package homework10.exercises;

import java.util.*;

public class Exercise2 {

    public static void runExercise1() {
        int temp = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert an int number to add to the Collection: ");

        ArrayList<Integer> number = new ArrayList<>(10);

        Integer input = Integer.parseInt(sc.nextLine());

        number.add(input);

        for (int i = 0; i < 9; i++) {
            Integer integer = number.get(i);
            temp += integer;
            number.add(temp);
            temp = integer;
        }
        System.out.println(Arrays.toString(number.toArray()));
    }
}

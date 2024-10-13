package Tasks_17_lesson.task2;

import java.util.Scanner;
import java.util.function.Predicate;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int sizeOfArray = sc.nextInt();

        int[] array = new int[sizeOfArray];
        System.out.println("Enter array: ");

        Predicate<Integer> isPositive = x -> x > 0;

        for(int i = 0; i < sizeOfArray; i++){
            array[i] = sc.nextInt();
            if(isPositive.test(array[i]))
                System.out.println(array[i] + " ");
        }
    }
}

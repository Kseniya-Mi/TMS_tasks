package Tasks_18_lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StreamTrain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> listElements = new ArrayList<>();
        listElements.add(1);
        listElements.add(2);
        listElements.add(3);
        listElements.add(4);
        listElements.add(2);
        listElements.add(5);
        listElements.add(6);
        listElements.add(4);
        listElements.add(7);
        listElements.add(8);

        List<Integer> uniqueEvenNumbers = listElements.stream()
                .distinct()
                .filter(x->x%2==0)
                .toList();

        int sum = uniqueEvenNumbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);
    }
}

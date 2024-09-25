package Tasks_15_lesson.task1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionTraining {
    public static void main(String[] args) {
            getUniqueElements();
    }

    public static void getUniqueElements(){
        System.out.println("Enter elements: ");
        Set<Integer> numbers = new HashSet<>();
        String line = getScanner().nextLine();
        String[] arrayLine = line.split(" ");

        for (String numStr : arrayLine) {
            numbers.add(Integer.parseInt(numStr));
        }

        System.out.println("Unique elements " + numbers);
    }

    public static Scanner getScanner(){
        return new Scanner(System.in);
    }
}

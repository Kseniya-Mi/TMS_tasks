package Tasks_17_lesson.task5;

import java.util.Scanner;
import java.util.function.Supplier;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line: ");
        StringBuilder line = new StringBuilder(sc.nextLine());

        Supplier<StringBuilder> reverseString = ()-> line.reverse();

        System.out.println(reverseString.get());

    }
}

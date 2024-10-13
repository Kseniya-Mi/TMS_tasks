package Tasks_17_lesson.task4;

import java.util.Scanner;
import java.util.function.Consumer;

public class Converting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter BYN: ");
        String sumBYN = sc.nextLine();
        String[] parts = sumBYN.split(" ");
        Consumer<String> convertingPrint = x -> System.out.println((Double.parseDouble(x) * 3.28) + " USD");

        convertingPrint.accept(parts[0]);
    }
}

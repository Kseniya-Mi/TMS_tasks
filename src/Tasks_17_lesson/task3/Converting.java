package Tasks_17_lesson.task3;

import java.util.Scanner;
import java.util.function.Function;

public class Converting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter BYN: ");
        String sumBYN = sc.nextLine();
        String[] parts = sumBYN.split(" ");
        Function<String, Double> converting = x -> (Double.parseDouble(x)*3.28);

        Double sumUSD = converting.apply(parts[0]);

        System.out.println(sumUSD + " USD");
    }
}

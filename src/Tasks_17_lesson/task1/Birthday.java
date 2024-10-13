package Tasks_17_lesson.task1;

import java.time.LocalDate;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birthday(format: yyyy-mm-dd): ");
        String birthday = sc.nextLine();

        LocalDate date = LocalDate.parse(birthday);;

        LocalDate dateOf100 = date.plusYears(100);

        System.out.println(dateOf100);
    }
}

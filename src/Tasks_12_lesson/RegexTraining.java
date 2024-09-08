package Tasks_12_lesson;

import java.util.Scanner;

public class RegexTraining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line :");
        String str = scanner.nextLine();

        //task1
        getAbbreviation(str);

        //task2
        getInformation(str);

    }

    public static void getAbbreviation(String str){
        String[] words = str.split("\\s+");

        System.out.println("Abbreviations :");
        for (String word : words) {
            if (word.matches("[a-zA-Z]{2,6}|[а-яА-я]{2,6}]")) {
                System.out.println(word);
            }
        }
    }

    public static void getInformation(String str){
        String[] words = str.split("\\s+");

    }
}

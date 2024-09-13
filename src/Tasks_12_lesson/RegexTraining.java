package Tasks_12_lesson;

import java.util.Scanner;

public class RegexTraining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line :");
        String str = scanner.nextLine();

        //task1
       // getAbbreviation(str);

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
        for (String word : words) {
            if (word.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}")) {
                System.out.println("E-mail: " + word);
            }
            if (word.matches("\\+\\(\\d{2}\\)\\d{7}")) {
                System.out.println("Telephone: " + word);
            }
            if (word.matches("\\d{4}-\\d{4}-\\d{2}")) {
                System.out.println("Number of document: " + word);
            }
        }
    }
}

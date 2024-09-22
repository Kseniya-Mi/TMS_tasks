package Tasks_14_lesson.task2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter path to file with numbers: ");
        String pathToDoc = sc.nextLine();

        String validOutputFile = "src/Tasks_14_lesson/task2/Valid numbers report.txt";
        String invalidOutputFile = "src/Tasks_14_lesson/task2/Invalid numbers report.txt";


        try{
            BufferedReader reader = new BufferedReader(new FileReader(pathToDoc));
            FileWriter validWriter = new FileWriter(validOutputFile);
            FileWriter invalidWriter = new FileWriter(invalidOutputFile);
            String line;

            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (checkNumber(line)) {
                    validWriter.write(line + "\n");
                } else {
                    invalidWriter.write(line + " - Invalid begining of number\n");
                }
            }
            validWriter.close();
            invalidWriter.close();

            System.out.println("Validation complete. Valid document numbers written to " + validOutputFile);
            System.out.println("Invalid document numbers written to " + invalidOutputFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean checkNumber(String docNumber){
        return docNumber.length() == 15 &&
                (docNumber.startsWith("docnum") || docNumber.startsWith("contract"));
    }
}

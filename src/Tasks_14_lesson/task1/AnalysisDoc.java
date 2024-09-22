package Tasks_14_lesson.task1;

import java.io.*;

public class AnalysisDoc {
    public static void main(String[] args) {
        String inputFile = "src/Tasks_14_lesson/task1/Romeo and Julietta.txt";
        String outputFile = "src/Tasks_14_lesson/task1/Longest word.txt";

        String longestWord = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("[^a-zA-Z']+");
                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            writer.write(longestWord);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("The longest word in the text is: " + longestWord);
        System.out.println("The longest word has been written to " + outputFile);
    }
}

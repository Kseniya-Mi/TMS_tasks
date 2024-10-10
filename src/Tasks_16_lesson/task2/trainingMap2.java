package Tasks_16_lesson.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class trainingMap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] array = line.split(" ");

        Map<String, String> checkingVal = new HashMap<>();

        for(int i = 0; i < array.length; i++){
            checkingVal.put(array[i].substring(0,1), array[i].substring(array[i].length() - 1));
        }

        for(Map.Entry<String,String> item: checkingVal.entrySet()) {
            System.out.println("\"" + item.getKey() + "\"" + " : " + "\"" + item.getValue() + "\"");
        }
    }
}

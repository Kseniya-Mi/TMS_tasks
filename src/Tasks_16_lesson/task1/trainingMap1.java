package Tasks_16_lesson.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class trainingMap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] array = line.split(" ");

        Map<String, Boolean> checkingVal = new HashMap<>();

        for(int i = 0; i < array.length; i++){
            if(checkingVal.containsKey(array[i]))
                checkingVal.put(array[i], true);
            else
                checkingVal.put(array[i], false);
        }

        for(Map.Entry<String,Boolean> item: checkingVal.entrySet()) {
            System.out.println("\"" + item.getKey() + "\"" + " : " + item.getValue());
        }
    }
}

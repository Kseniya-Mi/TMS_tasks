package Tasks_5_lesson;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
       // getBasicArray(); //task 1
       // arrayString();   //task 2
       // getSnake();      //task 3
    }

    public static Scanner getScanner(){
        return new Scanner(System.in);
    }

    public static void getInput(int lines, int columns, int[][]numbers){
        for(int outer = 0; outer < lines; outer++){
            for(int inner = 0; inner < columns; inner++){
                numbers[outer][inner] = new Random().nextInt(1,101);
            }
        }
    }

    public static void setArray(int[][] numbers){
        for(int[] outer: numbers){
            for(int inner: outer){
                System.out.print(inner + "\t");
            }
            System.out.println();
        }
    }

    public static void setArray(String[][] numbers){
        for(String[] outer: numbers){
            for(String inner: outer){
                System.out.print(inner + " ");
            }
            System.out.println();
        }
    }

    public static void getStringArray(String[][] stringArray){
        final int border = 8;

        for(int outer = 0; outer < border; outer++){
            for(int inner = 0; inner < border; inner++){
                if((outer + inner) % 2 == 0)
                    stringArray[outer][inner] = "W";
                else
                    stringArray[outer][inner] = "B";
            }
        }
    }

    public static void getBasicArray(){
        System.out.print("Enter amount of lines: ");
        int lines = getScanner().nextInt();

        System.out.print("Enter amount of columns: ");
        int columns = getScanner().nextInt();

        int[][] numbers = new int[lines][columns];

        getInput(lines, columns, numbers);

        System.out.println("Array: ");
        setArray(numbers);

        System.out.print("Enter number to add: ");
        int addNumber = getScanner().nextInt();

        int sum = 0;
        for(int outer = 0; outer < lines; outer++){
            for(int inner = 0; inner < columns; inner++){
                numbers[outer][inner]+=addNumber;
                sum += numbers[outer][inner];
            }
        }

        System.out.println("Array with change: ");
        setArray(numbers);

        System.out.print("Sum: " + sum);
    }

    public static void arrayString(){
        String[][] stringArray = new String[8][8];

        getStringArray(stringArray);

        setArray(stringArray);
    }

    public static void getSnake(){
        System.out.print("Enter amount of lines: ");
        int lines = getScanner().nextInt();

        System.out.print("Enter amount of columns: ");
        int columns = getScanner().nextInt();

        int[][] numbers = new int[lines][columns];

        getInput(lines, columns, numbers);

        int value = 0;

        for(int outer = 0; outer < lines; outer ++){
            for(int inner = 0, inn = columns - 1; inner < columns && inn >= 0; inner++, inn--){
                if(outer % 2 == 0)
                    numbers[outer][inner] = value;
                else
                    numbers[outer][inn] = value;
                value++;
            }
        }

        setArray(numbers);
    }
}

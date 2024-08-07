package Tasks_3_lesson;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

       // getTypeNumber();  //task 1
       // getTemperature(); //task 2
       // getSquare();      //task 3
       // getSubsequence(); //task 4
       // getSum();         //task 5
    }

    public static void getTypeNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();

        if (number % 2 == 0)
            System.out.println("Number is even.");
        else
            System.out.println("Number is odd.");
    }

    public static void getTemperature(){
        final int maxTemp = -5;
        final int minTemp = -20;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        int temperature = input.nextInt();

        if (temperature > maxTemp)
            System.out.println("Warm");
        else if (temperature < maxTemp && temperature > minTemp)
            System.out.println("Normal");
        else if (temperature < minTemp)
            System.out.println("Cold");
    }

    public static void getSquare(){

        for(int i = 10; i <= 20; i++){
            System.out.print(i*i + " ");
        }
    }

    public static void getSubsequence(){
        final int step = 7;
        int counter = 0;

        while(counter < 14){
            counter++;
            System.out.print(step * counter + " ");
        }
    }

    public static void getSum() {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number = 0;

        System.out.print("Enter number: ");

        if (input.hasNextInt()) {
            number = input.nextInt();

            while (number > 0) {
                sum += number;
                number--;
            }
            System.out.print("Sum is: " + sum);
        }else
            System.out.println("Incorrect input. Try again...");
    }
}

package Tasks_4_lesson;

import java.util.Objects;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

       // getArrayOrder(); //task 1
       // getMinMax();     //task 2
       // getIndexMinMax();//task 3
       // getNullAmount(); //task 4
       // getReverse();    //task 5
       // getTypeSequence();//task 6
       // getCalculation(); //task 7
    }

    public static void getArrayOrder(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int amount = input.nextInt();
        int[] arr = new int[amount];

        System.out.println("Do you want to fill array? (Yes - 1 /No - 2)");
        int answer = input.nextInt();

        if (answer == 1){
            System.out.print("Enter elements: ");
            for(int counter = 0; counter < amount; counter++){
                arr[counter] = input.nextInt();
            }
        } else{
            for(int counter = 0; counter < amount; counter++){
                arr[counter] = (int)(0 + Math.random() * 10);
            }
        }

        System.out.println("Direct order: ");
        for(int counter = 0; counter < amount; counter++){
            System.out.print(arr[counter] + " ");
        }

        System.out.println();
        System.out.println("Reverse order: ");
        for(int counter = amount - 1; counter >= 0; counter--){
            System.out.print(arr[counter] + " ");
        }
    }

    public static void getMinMax(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int amount = input.nextInt();
        int[] arr = new int[amount];

        System.out.println("Do you want to fill array? (Yes - 1 /No - 2)");
        int answer = input.nextInt();

        if (answer == 1){
            System.out.print("Enter elements: ");
            for(int counter = 0; counter < amount; counter++){
                arr[counter] = input.nextInt();
            }
        } else{
            for(int counter = 0; counter < amount; counter++){
                arr[counter] = (int)(0 + Math.random() * 10);
            }
        }

        int minVar = arr[0], maxVar = arr[0];
        for(int counter = 0; counter < amount; counter++){
            if(minVar > arr[counter])
                minVar = arr[counter];
            if(maxVar < arr[counter])
                maxVar = arr[counter];
        }

        System.out.println("Max value: " + maxVar + " and min value: " + minVar);
    }

    public static void getIndexMinMax(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int amount = input.nextInt();
        int[] arr = new int[amount];

        System.out.println("Do you want to fill array? (Yes - 1 /No - 2)");
        int answer = input.nextInt();

        if (answer == 1){
            System.out.print("Enter elements: ");
            for(int counter = 0; counter < amount; counter++){
                arr[counter] = input.nextInt();
            }
        } else{
            for(int counter = 0; counter < amount; counter++){
                arr[counter] = (int)(0 + Math.random() * 10);
            }
        }

        int minVar = arr[0], maxVar = arr[0], indexMin = 0, indexMax = 0;
        for(int counter = 0; counter < amount; counter++){
            if(minVar > arr[counter]){
                minVar = arr[counter];
                indexMin = counter;
            }
            if(maxVar < arr[counter]){
                maxVar = arr[counter];
                indexMax = counter;
            }
        }

        System.out.println("Max value index: " + (indexMax + 1) + " and min value index: " + (indexMin + 1));
    }

    public static void getNullAmount(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int amount = input.nextInt();
        int[] arr = new int[amount];

        System.out.println("Do you want to fill array? (Yes - 1 /No - 2)");
        int answer = input.nextInt();

        if (answer == 1){
            System.out.print("Enter elements: ");
            for(int counter = 0; counter < amount; counter++){
                arr[counter] = input.nextInt();
            }
        } else{
            System.out.print("Array elements: ");
            for(int counter = 0; counter < amount; counter++){
                arr[counter] = (int)(0 + Math.random() * 10);
                System.out.print(arr[counter] + " ");
            }
        }

        int counterNull = 0;
        for(int counter = 0; counter < amount; counter++){
            if(arr[counter] == 0)
                counterNull++;
        }

        if (counterNull > 0)
            System.out.println("Amount of zeros is " + counterNull);
        else
            System.out.println("In this array no zeros ");
    }

    public static void getReverse(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int amount = input.nextInt();
        int[] arr = new int[amount];

        System.out.println("Do you want to fill array? (Yes - 1 /No - 2)");
        int answer = input.nextInt();

        if (answer == 1){
            System.out.print("Enter elements: ");
            for(int counter = 0; counter < amount; counter++){
                arr[counter] = input.nextInt();
            }
        } else{
            System.out.print("Array elements: ");
            for(int counter = 0; counter < amount; counter++){
                arr[counter] = (int)(0 + Math.random() * 10);
                System.out.print(arr[counter] + " ");
            }
        }

        System.out.println();
        int[] arrReverse = new int[amount];
        for(int counter = 0, index = amount - 1; counter < amount && index >= 0; counter++, index--){
            arrReverse[index] = arr[counter];
        }

        System.out.print("Reverse array: ");
        for(int counter = 0; counter < amount; counter++){
            System.out.print(arrReverse[counter] + " ");
        }
    }

    public static void getTypeSequence(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int amount = input.nextInt();
        int[] arr = new int[amount];

        System.out.println("Do you want to fill array? (Yes - 1 /No - 2)");
        int answer = input.nextInt();

        if (answer == 1){
            System.out.print("Enter elements: ");
            for(int counter = 0; counter < amount; counter++){
                arr[counter] = input.nextInt();
            }
        } else{
            System.out.print("Array elements: ");
            for(int counter = 0; counter < amount; counter++){
                arr[counter] = (int)(0 + Math.random() * 10);
                System.out.print(arr[counter] + " ");
            }
        }

        System.out.println();
        int counterMin = 1, counterMax = 1;
        for(int counter = 0; counter < amount-1; counter++){
            if(arr[counter]<arr[counter+1])
                counterMax++;
            else if(arr[counter]>arr[counter+1])
                counterMin++;
        }

        if(counterMax == amount)
            System.out.println("Sequence is increase ");
        else if(counterMin == amount)
            System.out.println("Sequence is decrease ");
        else
            System.out.println("It's just sequence ");
    }

    public static void getCalculation(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int amount = input.nextInt();
        int[] arr = new int[amount];

        System.out.print("Enter elements: ");
        for(int counter = 0; counter < amount; counter++){
            arr[counter] = input.nextInt();
        }

        if(arr[amount - 1] < 9) {
            arr[amount - 1] ++;
            for (int counter = 0; counter < amount; counter++)
                System.out.print(arr[counter] + " ");
        }
        else{
            int var = 0;
            int ind = 1;
            for(int counter = amount - 1; counter >= 0; counter--) {
               var = (arr[counter] + ind)/10;
               arr[counter] = (arr[counter] + ind) % 10;
                if(var == 1)
                    ind = 1;
                else
                    ind = 0;
            }
            if(arr[0] == 0) {
                int[] arrNew = new int[amount + 1];
                arrNew[0] = 1;
                for(int counter = 1; counter < amount + 1; counter++){
                    arrNew[counter] = arr [counter - 1];
                }
                for(int counter = 0; counter < amount + 1; counter++)
                    System.out.print(arrNew[counter] + " ");
            }
            else
                for(int counter = 0; counter < amount; counter++)
                    System.out.print(arr[counter] + " ");
        }
    }
}

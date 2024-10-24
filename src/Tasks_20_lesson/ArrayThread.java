package Tasks_20_lesson;

import java.util.Scanner;

public class ArrayThread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount of elements: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        MaxFinder max = new MaxFinder(array);
        MinFinder min = new MinFinder(array);

        Thread maxThread = new Thread(max);
        Thread minThread = new Thread(min);

        maxThread.start();
        minThread.start();

        try{
            minThread.join();
            maxThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int maxV = max.getMax();
        int minV = min.getMin();

        System.out.println("Максимальное значение: " + maxV);
        System.out.println("Минимальное значение: " + minV);

    }
}

class MaxFinder implements Runnable{
    private int[] array;
    private int max;

    MaxFinder(int[] array){
        this.array = array;
    }

    @Override
    public void run() {
        max = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++){
            if(max < array[i])
                max = array[i];
        }
    }

    int getMax(){
        return max;
    }
}

class MinFinder implements Runnable{
    private int[] array;
    private int min;

    MinFinder(int[] array){
        this.array = array;
    }

    @Override
    public void run() {
        min = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++){
            if(min > array[i])
                min = array[i];
        }
    }

    int getMin(){
        return min;
    }
}
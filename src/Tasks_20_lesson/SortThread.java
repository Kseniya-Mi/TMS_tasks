package Tasks_20_lesson;

import java.util.Arrays;
import java.util.Scanner;

public class SortThread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sizes of 3 arrays: ");
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int size3 = sc.nextInt();

        int[] array1 = new int[size1];
        int[] array2 = new int[size2];
        int[] array3 = new int[size3];

        System.out.println("Enter elements 1st array: ");
        for(int i = 0; i < size1; i++){
            array1[i] = sc.nextInt();
        }

        System.out.println("Enter elements 2nd array: ");
        for(int i = 0; i < size2; i++){
            array2[i] = sc.nextInt();
        }

        System.out.println("Enter elements 3rd array: ");
        for(int i = 0; i < size3; i++){
            array3[i] = sc.nextInt();
        }

        BubbleSortThread bs = new BubbleSortThread(array1);
        InsertSortThread is = new InsertSortThread(array2);
        SelectionSortThread ss = new SelectionSortThread(array3);

        Thread bsThread = new Thread(bs);
        Thread isThread = new Thread(is);
        Thread ssThread = new Thread(ss);

        bsThread.start();
        isThread.start();
        ssThread.start();

        try{
            bsThread.join();
            isThread.join();
            ssThread.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Bubble sort: " + Arrays.toString(array1));
        System.out.println("Insert sort: " + Arrays.toString(array2));
        System.out.println("Select sort: " + Arrays.toString(array3));
    }
}

class BubbleSortThread implements Runnable{
    private int[] array;

    BubbleSortThread(int[] array){
        this.array = array;
    }

    @Override
    public void run() {
        BubbleSort(array);
    }

    public void BubbleSort(int[] array){
        int n = array.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

class InsertSortThread implements Runnable{
    private int[] array;

    InsertSortThread(int[] array){
        this.array = array;
    }

    @Override
    public void run() {
     InsertSort(array);
    }

    private void InsertSort(int[] array){
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}

class SelectionSortThread implements Runnable{
    private int[] array;

    SelectionSortThread(int[] array){
        this.array = array;
    }

    @Override
    public void run() {
        SelectionSort(array);
    }

    public void SelectionSort(int[] array){
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }
}
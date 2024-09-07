package Tasks_11_lesson;

import java.util.Scanner;

public class StringTasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 lines: ");
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        String str3 = input.nextLine();

        // task1
        findShortLongString(str1, str2, str3);
        System.out.println("-----------------------------------");

        // task2
        sortStrings(str1, str2, str3);
        System.out.println("-----------------------------------");

        // task3
        getLengthLessAverage(str1, str2, str3);
        System.out.println("-----------------------------------");

        // task4
        getUniqueWord(str1);
        getUniqueWord(str2);
        getUniqueWord(str3);
        System.out.println("-----------------------------------");

        // task5
        getDoubleLetter(str1);
        System.out.println("-----------------------------------");

        // task6
        isPalindrome(str1);
    }

    public static void findShortLongString(String str1, String str2, String str3){
        String maxString = str1;
        String minString = str1;

        if(maxString.length() < str2.length())
            maxString = str2;
        if(maxString.length() < str3.length())
            maxString = str3;

        if(minString.length() > str2.length())
            minString = str2;
        if(minString.length() > str3.length())
            minString = str3;

        System.out.println("Shortest string is: " + minString);
        System.out.println("Longest string is: " + maxString);
    }

    public static void sortStrings(String str1, String str2, String str3){
        String maxString = str1;
        String middleString = str1;
        String minString = str1;

        if(maxString.length() < str2.length())
            maxString = str2;
        if(maxString.length() < str3.length())
            maxString = str3;

        if(minString.length() > str2.length())
            minString = str2;
        if(minString.length() > str3.length())
            minString = str3;

        if(!str2.equals(maxString) && !str2.equals(minString))
            middleString = str2;
        if(!str3.equals(maxString) && !str3.equals(minString))
            middleString = str3;

        System.out.println(minString + "\n" + middleString + "\n" + maxString);
    }

    public static void getLengthLessAverage(String str1, String str2, String str3){
        long averageSize = (str1.length() + str2.length() + str3.length()) / 3;

        if(str1.length() < averageSize)
            System.out.println(str1 + " " + str1.length());
        if(str2.length() < averageSize)
            System.out.println(str2 + " " + str2.length());
        if(str3.length() < averageSize)
            System.out.println(str3 + " " + str3.length());
    }

    public static void getUniqueWord(String str) {
        char[] str1Char = str.toCharArray();
        int i = 0;
        String temp;
        while (true) {
            temp = "";
            while (str1Char[i] != ' ') {
                temp += str1Char[i];
                if(i == str.length() - 1)
                    break;
                else
                    i++;
            }
            char[] word = temp.toCharArray();
            int sum = 0;

            for (int letter1 = 0; letter1 < temp.length(); letter1++) {
                for (int letter2 = 0; letter2 < temp.length(); letter2++) {
                    if (word[letter1] == word[letter2]) {
                        sum++;
                    }
                }
            }

            if(sum == temp.length()) {
                System.out.println(temp);
                break;
            }

            i++;
        }
    }

    public static void getDoubleLetter(String str){
        char[] newArray = str.toCharArray();
        char[] doubleArray = new char[str.length()*2];

        for(int i = 0, j = 0; i < str.length() && j < str.length()*2; i++, j+=2){
            doubleArray[j] += newArray[i];
            doubleArray[j + 1] += newArray[i];
        }

        System.out.println(doubleArray);
    }

    public static void isPalindrome(String str){
        char[] array = str.toCharArray();
        int amountOfWords = 1;

        for(int i = 0; i < str.length(); i++){
            if(array[i] == ' ')
                amountOfWords++;
        }

        String[] words = new String[amountOfWords];
        int stop = 0;

        for (int i = 0; i < amountOfWords; i++){
            words[i] = "";
            for(int j = 0; j + stop < str.length(); j++){
               if(array[j + stop] != ' ')
                   words[i] += array[j + stop];
               else {
                   stop += (j + 1);
                   break;
               }
            }
        }

        int number;
        while(true) {
            System.out.println("Enter number of word to check: ");
            number = getScanner().nextInt();

            if(number > amountOfWords || number < 0)
                System.out.println("Incorrect input. Try again ");
            else break;
        }

        char[] wordToCheck = words[number - 1].toCharArray();
        int counter = 0;

        for(int i = 0, j = words[number - 1].length() - 1; i < words[number - 1].length() && j >= 0; i++, j--){
            if(wordToCheck[i] == wordToCheck[j])
                counter++;
        }

        if(counter == words[number - 1].length())
            System.out.println("This word is palindrome");
        else System.out.println("This word is not palindrome");
    }

    public static Scanner getScanner(){
        return new Scanner(System.in);
    }
}

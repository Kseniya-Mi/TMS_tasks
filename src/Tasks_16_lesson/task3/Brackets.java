package Tasks_16_lesson.task3;

import java.util.Scanner;

public class Brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String leftSide = line.substring(0, line.length()/2 );
        String rightSide = line.substring(line.length()/2);

        char[] arrayRight = rightSide.toCharArray();

        for(int i = 0; i < arrayRight.length; i++){
            if(arrayRight[i] == '}')
                arrayRight[i] = '{';
            else if(arrayRight[i] == ']')
                arrayRight[i] = '[';
            else if(arrayRight[i] == ')')
                arrayRight[i] = '(';
        }

        rightSide = String.valueOf(arrayRight);
        StringBuilder rV = new StringBuilder(rightSide);
        String rightValue = String.valueOf(rV.reverse());

        if(rightValue.equals(leftSide))
            System.out.println("Balanced");
        else
            System.out.println("Not balanced");

    }
}

package Tasks_7_lesson.Apple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getApple();
    }

    public static void getApple() {
        Scanner input = new Scanner(System.in);

        Apple apple = new Apple("green");
        System.out.println(apple.setInfo());

        System.out.println("Enter color: ");
        String color = input.nextLine();

        apple = new Apple(color);

        System.out.println("New color: " + apple.setInfo());
    }
}

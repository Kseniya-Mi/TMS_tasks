package Tasks_8_lesson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Let's feed our animals!\nWhich one do you want to feed?\n1) Rabbit\n2)Tiger\n3)Dog");
        int choice1 = input.nextInt();

        System.out.println("Choose type of food: Grass or Meat (enter word)");
        String choice2 = input.next();

        switch(choice1){
            case 1:
                Animal rabbit = new Rabbit("Ruby");
                rabbit.eat(choice2);
                rabbit.voice();
            case 2:
                Animal tiger = new Tiger("Ralf");
                tiger.eat(choice2);
                tiger.voice();
            case 3:
                Animal dog = new Dog("Guffy");
                dog.eat(choice2);
                dog.voice();
        }
    }
}

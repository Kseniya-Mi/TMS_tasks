package Tasks_6_lesson;

import java.util.Scanner;

public class MainForATM {
    public static void main(String[] args) {

        System.out.println("Fill ATM with banknotes!");
        setOutput(20);
        int startAmount20 = getScanner().nextInt();
        setOutput(50);
        int startAmount50 = getScanner().nextInt();
        setOutput(100);
        int startAmount100 = getScanner().nextInt();

        ATM money = new ATM(startAmount20, startAmount50, startAmount100);

        while (true) {
            System.out.println("Choose operation: \n 1)Add money \n 2)Withdraw money");
            int choice = getScanner().nextInt();

            switch (choice) {
                case 1:
                    setOutput(100);
                    int amountOf100Added = getScanner().nextInt();

                    setOutput(50);
                    int amountOf50Added = getScanner().nextInt();

                    setOutput(20);
                    int amountOf20Added = getScanner().nextInt();

                    money.addMoney(amountOf20Added, amountOf50Added, amountOf100Added);
                    break;
                case 2:
                    System.out.println("Enter sum to withdraw: ");
                    int sum = getScanner().nextInt();

                    money.withdrawMoney(sum);
                    break;
                default:
                    System.out.println("Incorrect input. Please try again...");
                    break;
            }

            System.out.println("\nDo you want to continue? (1 - yes/ 2 - no)");
            int answer = getScanner().nextInt();

            if (answer == 2)
                break;
        }
    }

    public static void setOutput(int n){
        System.out.println("Enter amount of " + n + "-denomination banknotes: ");
    }

    public static Scanner getScanner(){
        return new Scanner(System.in);
    }
}

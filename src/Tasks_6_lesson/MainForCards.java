package Tasks_6_lesson;

import java.util.Scanner;

public class MainForCards {
    public static void main(String[] args) {

        CreditCard card1 = new CreditCard(1, 14500);
        CreditCard card2 = new CreditCard(2, 1500);
        CreditCard card3 = new CreditCard(3, 21500);

        while (true) {

            System.out.print("Choose card (enter account number): ");
            int id = getScanner().nextInt();

            while(true) {
                if (id > 3 || id < 1){
                    System.out.println("Incorrect input. Try again...");
                    System.out.print("Choose card (enter account number): ");
                    id = getScanner().nextInt();}
                else
                    break;
            }

            System.out.println("Choose operation: \n 1) Check balance \n 2) Withdraw money \n 3) Add money");
            int choice = getScanner().nextInt();

            switch (choice) {
                case 1:
                    if (card1.accountNumber == id)
                        System.out.println(card1.checkMoney());
                    else if (card2.accountNumber == id)
                        System.out.println(card2.checkMoney());
                    else if (card3.accountNumber == id)
                        System.out.println(card3.checkMoney());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    int amountForWithdraw = getScanner().nextInt();

                    if (card1.accountNumber == id)
                        checkMoney(card1, amountForWithdraw);
                    else if (card2.accountNumber == id)
                        checkMoney(card2, amountForWithdraw);
                    else if (card3.accountNumber == id)
                        checkMoney(card3, amountForWithdraw);
                    break;
                case 3:
                    System.out.print("Enter amount to add: ");
                    int amountForAdd = getScanner().nextInt();

                    if (card1.accountNumber == id)
                        card1.addMoney(amountForAdd);
                    else if (card2.accountNumber == id)
                        card2.addMoney(amountForAdd);
                    else if (card3.accountNumber == id)
                        card3.addMoney(amountForAdd);
                    break;
                default:
                    System.out.println("Incorrect input. Try again...");
                    break;
            }

            System.out.println("\nDo you want to continue? (1 - yes/ 2 - no)");
            int answer = getScanner().nextInt();

            if (answer == 2)
                break;
        }
    }

    public static Scanner getScanner(){
        return new Scanner(System.in);
    }

    //Method for check amount of money on balance to withdraw1
    //if it hasn't enough to withdraw, user see message
    //else program do this operation
    public static void checkMoney(CreditCard card, int amountForWithdraw){
        if(card.currentBalance - amountForWithdraw < 0)
            System.out.println("Not enough money to complete operation. Please check balance and continue...");
        else
            card.withdrawMoney(amountForWithdraw);
    }
}

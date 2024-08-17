package Tasks_6_lesson;

public class CreditCard {
    int accountNumber;
    int currentBalance;

    CreditCard(int accountNumber, int currentBalance){
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
    }

    int checkMoney(){
        return currentBalance;
    }

    int addMoney(int amountForAdd){
        currentBalance += amountForAdd;
        return currentBalance;
    }

    int withdrawMoney(int amountForWithdraw){
        currentBalance -= amountForWithdraw;
        return currentBalance;
    }
}

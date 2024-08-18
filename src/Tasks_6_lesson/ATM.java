package Tasks_6_lesson;

public class ATM {
    int amountOf20;
    int amountOf50;
    int amountOf100;

    ATM(int amountOf20, int amountOf50, int amountOf100){
        this.amountOf20 = amountOf20;
        this.amountOf50 = amountOf50;
        this.amountOf100 = amountOf100;
    }

    void addMoney(int amountOf20Added, int amountOf50Added, int amountOf100Added){
        amountOf20 += amountOf20Added;
        amountOf50 += amountOf50Added;
        amountOf100 += amountOf100Added;
    }

    void withdrawMoney(int sum){
        int quantity20 = 0;
        int quantity50 = 0;
        int quantity100 = 0;

        if (amountOf20 * 20 + amountOf50 * 50 + amountOf100 * 100 < sum)
            System.out.println("The ANM cannot dispense this amount. ");

        while(sum > 0){
            if((sum >= 100) && ((sum - 100) % 100 == 0 || (sum - 100) % 50 == 0 || (sum - 100) % 20 == 0 )
                    && (quantity100 < amountOf100)){
                sum -= 100;
                quantity100++;
            }
            else if((sum >= 50) && ((sum - 50) % 50 == 0 || (sum - 50) % 20 == 0) && (quantity50 < amountOf50)){
                sum -= 50;
                quantity50++;
            }
            else if((sum >= 20) && ((sum - 20) % 20 == 0) && (quantity20 < amountOf20)){
                sum -= 20;
                quantity20++;
            }
            else if(sum % 10 != 0 || sum < 20 || sum > 20 && sum < 40) {
                System.out.println("The ANM cannot dispense this amount ");
                break;
            }
        }

        if(quantity20 != 0 || quantity50 != 0 || quantity100 != 0) {
            System.out.println("Number of 100-denomination banknotes: " + quantity100);
            System.out.println("Number of 50-denomination banknotes: " + quantity50);
            System.out.println("Number of 20-denomination banknotes: " + quantity20);
        }
    }
}

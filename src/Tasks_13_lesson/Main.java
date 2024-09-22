package Tasks_13_lesson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter login: ");
            String login = sc.nextLine();
            System.out.println("Enter password: ");
            String password = sc.nextLine();
            System.out.println("Enter confirmPassword: ");
            String confirmPassword = sc.nextLine();

            CheckingInfo.checkInfo(password, login, confirmPassword);

        }catch(WrongPasswordException | WrongLoginException ex){
            System.err.println(ex.getMessage());
        }
    }
}

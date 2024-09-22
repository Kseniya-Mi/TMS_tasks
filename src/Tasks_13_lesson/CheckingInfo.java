package Tasks_13_lesson;

public class CheckingInfo {
    private String password;
    private String login;
    private String confirmPassword;

    CheckingInfo(String password, String login, String confirmPassword){
        this.confirmPassword = confirmPassword;
        this.login = login;
        this.password = password;
    }

    public static void checkInfo(String password, String login, String confirmPassword) throws WrongLoginException,
            WrongPasswordException {

        if (!checkLogin(login))
            throw new WrongLoginException("Invalid login provided.");
        if(!checkPassword(password, confirmPassword))
            throw new WrongPasswordException("Invalid password provided.");
        if (checkLogin(login) && checkPassword(password, confirmPassword))
            System.out.println("true");
    }

    private static boolean checkPassword(String password, String confirmPassword){
        char[] arrayPassword = password.toCharArray();
        char[] arrayNumb = new char[]{'1','2','3','4','5','6','7','8','9','0'};
        int counterNumb = 0, counterSpace = 0;
        for(int i = 0; i < password.length(); i++){
            if(arrayPassword[i] == arrayNumb[i])
                counterNumb++;
            if( arrayPassword[i] == ' ')
                counterSpace++;
        }
        return ((counterNumb > 0) && (counterSpace == 0) && (password.length() < 20)
                && (password.equals(confirmPassword)));
    }

    private static boolean checkLogin(String login){
        int counterSpace = 0;
        char[] arrayLogin = login.toCharArray();
        for(int i = 0; i < login.length(); i++){
            if( arrayLogin[i] == ' ')
                counterSpace++;
        }

        return ((counterSpace == 0) && (login.length() < 20));
    }
}

class WrongLoginException extends Exception{

    public WrongLoginException(String message){
        super(message);
    }

    public WrongLoginException(){}
}

class WrongPasswordException extends Exception{

    public WrongPasswordException(String message){
        super(message);
    }

    public WrongPasswordException(){}
}
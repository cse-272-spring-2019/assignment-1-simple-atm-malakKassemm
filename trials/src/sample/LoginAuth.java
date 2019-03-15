package sample;

public class LoginAuth {
    public String passcode;

    public LoginAuth(String passcode){
        this.passcode = passcode;
    }

    public boolean ValidationOfEnteredPasscode(String passcode) {
        boolean validationResult = false ;

        if (passcode!=null){
            validationResult = passcode.equals("0007");
        }
        return validationResult;
    }


}




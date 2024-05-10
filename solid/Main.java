package solid;

public class Main {

    public static void main(String[] args) {

        SignUp signUp = new SignUp(new PhoneOtpSender());

        signUp.registerClick();

    }
}

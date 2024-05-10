package solid;

public class SignUp {

    OtpSender otpSender;

    public SignUp(OtpSender otpSender) {
        this.otpSender = otpSender;
    }

    void registerClick() {
        System.out.println("User clicked register button.");
        otpSender.sendOtp();
    }



}

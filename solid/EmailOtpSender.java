package solid;

public class EmailOtpSender implements OtpSender{
    @Override
    public void sendOtp() {
        System.out.println("Sent OTP on email");
    }
}

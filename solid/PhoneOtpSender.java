package solid;

public class PhoneOtpSender implements OtpSender{
    @Override
    public void sendOtp() {
        System.out.println("Otp sent on phone.");
    }
}

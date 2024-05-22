package adapterdp;

import adapterdp.thirdpartapi.ICICIBankAPI;

import java.util.List;

public class ICICIBankAdapter implements BankingService{

    ICICIBankAPI iciciBankAPI = new ICICIBankAPI();


    @Override
    public Double checkBalance(String upiId) {
//        iciciBankAPi.getAmountInAccount()
        System.out.println("ICICI bank checking balance for " + upiId);
        return 1000.0;
    }

    @Override
    public List<String> getHistory(Integer accNo) {
        System.out.println("Getting history for ICICI");
        return List.of("100 to shop", "500 from Ajay");
    }

    @Override
    public void registerUpi(String upiId, Integer accNo) {

    }

    @Override
    public void pay(PaymentParameters paymentParameters) {
        System.out.printf("Payment %d being sent from %s to %s",
                paymentParameters.amount,
                paymentParameters.from, paymentParameters.to);
    }
}

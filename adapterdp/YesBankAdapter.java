package adapterdp;

import java.util.List;

public class YesBankAdapter implements BankingService{
    @Override
    public Double checkBalance(String upiId) {
        // yesBankApi.fetchBalance
        return null;
    }

    @Override
    public List<String> getHistory(Integer accNo) {
        return null;
    }

    @Override
    public void registerUpi(String upiId, Integer accNo) {

    }

    @Override
    public void pay(PaymentParameters paymentParameters) {

    }
}

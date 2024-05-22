package adapterdp;

import java.util.List;

public interface BankingService {

    Double checkBalance(String upiId);
    List<String> getHistory(Integer accNo);
    void registerUpi(String upiId, Integer accNo);
    void pay(PaymentParameters paymentParameters);

}

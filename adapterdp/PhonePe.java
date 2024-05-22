package adapterdp;

import java.util.List;

public class PhonePe {

    private final BankingService bankingService;

    public PhonePe(BankingService bankingService) {
        this.bankingService = bankingService;
    }

    private static final String THEME = "Purple";

    List<String> navigationButtons = List.of("History", "Home", "Pay", "Shop");


    void onHomeClick() {
        System.out.println("Home clicked");
    }

    void onHistoryClick() {
        bankingService.getHistory(123);
    }

    void onPayClick(String upiIdTo, Integer amount) {
        PaymentParameters paymentParameters = new PaymentParameters();
        paymentParameters.from = "rahulgrover99@oksbi";
        paymentParameters.to = upiIdTo;
        paymentParameters.amount = amount;

        bankingService.pay(paymentParameters);
    }

}

package interfaces;

public class YesBank implements BankingService {

    private final Object yesBankApi = new Object();

    @Override
    public int balance() {
        // Make a call to yes bank api to fetch the account balance;
        System.out.println("Yes bank api called for balance");
        return 0;
    }

    @Override
    public void transfer(int from, int to, int amount) {
        System.out.println("Yes bank api called for transfer");
    }

    @Override
    public void withdraw() {
        System.out.println("Yes bank api called for withdraw");
    }
}

package interfaces;

public class ICICIBank implements BankingService{
    @Override
    public void withdraw() {
        System.out.println("ICICI bank api called for withdraw");
    }

    @Override
    public int balance() {
        System.out.println("ICICI bank api called for balance");
        return 10;
    }

    @Override
    public void transfer(int from, int to, int amount) {
        System.out.println("ICICI bank api called for transfer");
    }
}

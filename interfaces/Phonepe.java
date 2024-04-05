package interfaces;

public class Phonepe {


    private final BankingService bankingService;

    public Phonepe(BankingService bankingService) {
        this.bankingService = bankingService;
    }

    int checkBankBalance() {
        return bankingService.balance();
    }


    boolean transferMoney() {
        bankingService.transfer(1, 1, 1);
        return true;
    }

}

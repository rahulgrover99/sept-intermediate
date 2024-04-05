package interfaces;

public class Main {

    public static void main(String[] args) {


        BankingService bs = new YesBank();
        Phonepe phonepe = new Phonepe(bs);


        phonepe.transferMoney();
        phonepe.checkBankBalance();


    }
}

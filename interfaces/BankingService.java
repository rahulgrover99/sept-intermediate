package interfaces;

public interface BankingService {

    int x = 1;

    // By default, all methods of interface are public and abstract
    void withdraw();
    int balance();
    void transfer(int from, int to, int amount);




}

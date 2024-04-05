package interfaces;

public interface BankingService {
    // By default, all methods of interface are public and abstract
    void withdraw();
    int balance();
    void transfer(int from, int to, int amount);

}

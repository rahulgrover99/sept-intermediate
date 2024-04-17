package deadlocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {

        Lock l1 = new ReentrantLock();
        Lock l2 = new ReentrantLock();
        Thread t1 = new Thread(new T1(l1, l2));
        Thread t2 = new Thread(new T2(l1, l2));

        t1.start();
        t2.start();


    }
}

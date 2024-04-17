package deadlocks;

import java.util.concurrent.locks.Lock;

public class T1 implements Runnable{
    Lock l1, l2;

    public T1(Lock l1, Lock l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    @Override
    public void run() {
        l1.lock();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("L1 Acquired by " + Thread.currentThread().getName());

        l2.lock();

        System.out.println("L2 Acquired by " + Thread.currentThread().getName());

        System.out.println("The thread ran." + Thread.currentThread().getName());

        l2.unlock();
        l1.unlock();
    }
}

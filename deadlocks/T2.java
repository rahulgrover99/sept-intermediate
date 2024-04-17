package deadlocks;

import java.util.concurrent.locks.Lock;

public class T2 implements Runnable{
    Lock l1, l2;

    public T2(Lock l1, Lock l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    @Override
    public void run() {


        l2.lock();
        System.out.println("L2 Acquired by " + Thread.currentThread().getName());

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



        l1.lock();
        System.out.println("L1 Acquired by " + Thread.currentThread().getName());

        System.out.println("The thread ran." + Thread.currentThread().getName());

        l1.unlock();
        l2.unlock();
    }
}

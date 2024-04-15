package addersubtractor;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    Counter counter;
    Lock lock;

    public Subtractor(Counter counter, Lock lock) {
        this.counter = counter;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("I am outside CS.");

            lock.lock();
            System.out.println("Counter from subtractor: " + counter.i);
            counter.i -= 1;
            System.out.println("Counter from subtractor after decrement: " + counter.i);
            lock.unlock();

        }
    }
}

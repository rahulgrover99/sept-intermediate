package addersubtractor;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{

    Counter counter;
    Lock lock;

    public Adder(Counter counter, Lock lock) {
        this.counter = counter;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {


            // Before accessing the critical section.
            // Try to get the lock;
            // tries to get the lock.
            lock.lock();

            System.out.println("Counter from adder: " + counter.i);

            counter.i += 1;
            // here preemption might happen.

//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            System.out.println("Counter from adder after sleep: " + counter.i);
            lock.unlock();

        }
    }
}

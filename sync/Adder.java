package sync;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{

    Counter counter;

    public Adder(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {


            // Before accessing the critical section.
            // Try to get the lock;
            // tries to get the lock.

//            synchronized (counter) {
                counter.increment(1);
//            }

//            System.out.println("Counter from adder: " + counter.getI());


            // here preemption might happen.

//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("Counter from adder after sleep: " + counter.getI());

        }
    }
}

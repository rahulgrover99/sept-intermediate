package sync;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    Counter counter;

    public Subtractor(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
//            System.out.println("I am outside CS.");

//            System.out.println("Counter from subtractor: " + counter.i);
//            synchronized (counter) {
                counter.increment(-1);
//            }

//            System.out.println("Counter from subtractor after decrement: " + counter.i);

        }
    }
}

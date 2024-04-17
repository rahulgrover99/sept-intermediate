package semaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private final Queue<Object> queue;
    private final Semaphore ps;
    private final Semaphore cs;

    public Producer(Queue<Object> queue, Semaphore ps, Semaphore cs) {
        this.queue = queue;
        this.ps = ps;
        this.cs = cs;
    }

    @Override
    public void run() {


            try {
                ps.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            queue.add(new Object());
            System.out.println(Thread.currentThread().getName() +
                    " added a shirt to queue - now we have " +
                    queue.size() + " shirts");
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        cs.release();


    }
}

package semaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    private final Queue<Object> queue;
    private final Semaphore ps;
    private final Semaphore cs;

    public Consumer(Queue<Object> queue, Semaphore ps, Semaphore cs) {
        this.queue = queue;
        this.ps = ps;
        this.cs = cs;
    }
    @Override
    public void run() {

            try {
                cs.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            queue.remove();
            System.out.println(Thread.currentThread().getName() +
                    " removed a shirt from queue - now we have " +
                    queue.size() + " shirts");
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        ps.release();


    }
}

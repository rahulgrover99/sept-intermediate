package threads;

public class ByeWorld implements Runnable{
    @Override
    public void run() {
        System.out.println("Bye world from Thread: " + Thread.currentThread().getName());
    }
}

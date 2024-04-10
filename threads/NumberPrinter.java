package threads;

public class NumberPrinter implements Runnable {

    private int i;

    public NumberPrinter(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("Printing " + i + " from thread: " + Thread.currentThread().getName());
    }
}

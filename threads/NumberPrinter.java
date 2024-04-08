package threads;

public class NumberPrinter implements Runnable {

//    private int i;
    private static int x = 0;

//    public NumberPrinter(int i) {
//        this.i = i;
//    }

    NumberPrinter() {

    }

    @Override
    public void run() {
        System.out.println("Printing " + x++ + " from thread: " + Thread.currentThread().getName());
    }
}

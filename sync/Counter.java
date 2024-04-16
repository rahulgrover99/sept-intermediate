package sync;

public class Counter {
    private  int i;


    public int getI() {
        return i;
    }

    public synchronized void increment(int value) {
        // this method can only be accessed by the thread
        // which has the access to the lock on the Counter object.
            i += value;

    }
}

package threads;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world from Thread: " + Thread.currentThread().getName());
////        fun();
//        Thread t1 = new Thread(new ByeWorld());
//        t1.setPriority(10);
//        t1.start();
//        System.out.println("Hello again from Thread: " + Thread.currentThread().getName());

        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(new NumberPrinter());
            t.setPriority((int)i%10 + 1);
            t.start();
        }

    }


    public static void fun() {
        System.out.println("Bye world from Thread: " + Thread.currentThread().getName());

    }
}

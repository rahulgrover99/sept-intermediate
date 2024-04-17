package semaphores;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class Main {

    public static void main(String[] args) {
        Queue<Object> objects = new ConcurrentLinkedQueue<>();

        Semaphore ps = new Semaphore(100);
        Semaphore cs = new Semaphore(0);


        for (int i = 0; i < 1000; i++) {
            Consumer c = new Consumer(objects, ps, cs);
            Thread tc = new Thread(c);
            Producer p = new Producer(objects, ps, cs);
            Thread tp = new Thread(p);
            tp.start();
            tc.start();
        }


//        for (int i = 0; i < 1000; i++) {
//            Producer p = new Producer(objects, ps, cs);
//            Thread tp = new Thread(p);
//            tp.start();
//        }




    }





}

package executor;

import threads.NumberPrinter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        ExecutorService executorService =
                Executors.newFixedThreadPool(1);

        for (int i = 0; i < 100; i++) {
            NumberPrinter np = new NumberPrinter(i + 1);
            executorService.submit(np);
        }

        executorService.close();


    }

}

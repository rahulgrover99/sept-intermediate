package callables;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Callable<Integer> callable = new SumReturner(5, 6);


        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Integer> integerFuture = executorService.submit(callable);

        System.out.println("Running.");
        System.out.println(integerFuture.isDone());

        while(!integerFuture.isDone()) {
            System.out.println("Continue");
        }

        System.out.println(integerFuture.get());

        System.out.println(12);

        executorService.close();

    }
}

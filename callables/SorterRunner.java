package callables;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SorterRunner {
    public static void main(String[] args) throws Exception {

        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Integer> arr = List.of(3, 1, 7, 8, 2, 4, 5, 9);
        List<Integer> sortedArr = executorService.submit(new Sorter(arr, executorService)).get();
        System.out.println(sortedArr);

    }
}

package callables;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {

    List<Integer> arr;

    public Sorter(List<Integer> arr, ExecutorService executorService) {
        this.arr = arr;
        this.executorService = executorService;
    }

    ExecutorService executorService;

    @Override
    public List<Integer> call() throws Exception {
        // 1. Create a left and right array
        // 2. Sort them individually
        // 3. Merge both the results and return.

        System.out.println("Thread " + Thread.currentThread().getName() + " Arr to sort: " + arr);

        if (arr.size() <= 1) {
            return arr;
        }

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int mid = arr.size() / 2;

        for (int i = 0; i < mid; i++) {
            left.add(arr.get(i));
        }
        for (int j = mid; j < arr.size(); j++) {
            right.add((arr.get(j)));
        }

        Sorter leftSorter = new Sorter(left, executorService);
        Sorter rightSorter = new Sorter(right, executorService);

        Future<List<Integer>> leftListFuture = executorService.submit(leftSorter);
        Future<List<Integer>> rightListFuture = executorService.submit(rightSorter);

        List<Integer> sortedLeft = leftListFuture.get();
        List<Integer> sortedRight = rightListFuture.get();


        System.out.println("Thread JOINING: " + Thread.currentThread().getName());
        System.out.println("Sorted left: " + sortedLeft);
        System.out.println("Sorted right " + sortedRight);

        List<Integer> result = new ArrayList<>();

        int i = 0, j = 0;

        while (i < sortedLeft.size() && j < sortedRight.size()) {
            if (sortedLeft.get(i) < sortedRight.get(j)) {
                result.add(sortedLeft.get(i));
                i++;
            } else {
                result.add(sortedRight.get(j));
                j++;
            }
        }

        while (i < sortedLeft.size()) {
            result.add(sortedLeft.get(i));
            i++;
        }

        while (j < sortedRight.size()) {
            result.add(sortedRight.get(j));
            j++;
        }

        return result;

    }
}

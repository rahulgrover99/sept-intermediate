package callables;

import java.util.List;
import java.util.concurrent.Callable;

public class SumReturner implements Callable<Integer> {
    int x, y;

    public SumReturner(int x, int y) {
        this.x = x;
        this.y = y;
    }



    @Override
    public Integer call() throws Exception {
        return x + y;
    }
}

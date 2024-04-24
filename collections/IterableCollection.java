package collections;

import java.util.Iterator;
import java.util.List;

public class IterableCollection implements Iterable<Integer>{

    List<Integer> integerList;

    public IterableCollection(List<Integer> integerList) {
        this.integerList = integerList;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            int cursor = 0;
            @Override
            public boolean hasNext() {
                return cursor < integerList.size();
            }

            @Override
            public Integer next() {
                return integerList.get(cursor++);
            }
        };
    }
}

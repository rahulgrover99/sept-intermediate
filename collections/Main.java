package collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        PrimitiveClass m1 = new PrimitiveClass("R", 1);
        PrimitiveClass m2 = new PrimitiveClass("G", 1);
        PrimitiveClass m3 = new PrimitiveClass("R", 2);


        List<PrimitiveClass> ms = new ArrayList<>(List.of(m1, m2, m3));

        System.out.println(ms);

        Collections.sort(ms, new Comparator<PrimitiveClass>() {
            @Override
            public int compare(PrimitiveClass primitiveClass, PrimitiveClass t1) {
                if (primitiveClass.name != t1.name) {
                    return t1.name.compareTo(primitiveClass.name);
                }
                return primitiveClass.id - t1.id;
            }
        });

        System.out.println(ms);


        for (PrimitiveClass myClass: ms) {
            System.out.println(myClass);
        }

        Iterator<PrimitiveClass> itr = ms.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }


        IterableCollection iterableCollection = new IterableCollection(List.of(1, 2, 3));
//       for (Integer integer: iterableCollection) {
//           System.out.println(integer);
//       }

        Iterator<Integer> iterator = iterableCollection.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

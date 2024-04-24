package generics;

import inheritance.Learner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WithoutGenerics {

    public static void main(String[] args) {

        Object x = new Learner();


        Pair coordinate = new Pair(90.0, 99.1);
        Pair studentData = new Pair("Rahul", 1);

        // Form
        // ID:
        // String name:

        System.out.println(coordinate.getFirst());

        System.out.println(((String)studentData.getFirst()).length());

        // Raw use of parameterized class 'List'

        List list = new ArrayList();
        List<Object> objectList = new ArrayList<>();

        list.add("hello");
//        list.get(0).length();
        String s = (String) list.get(0);
        System.out.println(s);

        HashMap hm = new HashMap();
        hm.put(1, 2);
        hm.put("rahul", "grover");

        PairGeneric pg = new PairGeneric();
        pg.first = "Rahul";


        ArrayList<PairGeneric<Integer, String>> variable = new ArrayList<>();

    }

    private static class Pair {
        Object first;
        Object second;

        public Pair(Object first, Object second) {
            this.first = first;
            this.second = second;
        }

        Object getFirst() {
            return first;
        }
        Object getSecond() {
            return second;
        }
    }
}

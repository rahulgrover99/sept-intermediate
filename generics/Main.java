package generics;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

//        PairGeneric<String, Long> studentData = new PairGeneric<>("Rahul", 1L);
//        PairGeneric<Double, Double> coordinate = new PairGeneric<>(20.0, 29.0);
//
//
//        System.out.println(studentData.first.length());
//        System.out.println(studentData.second + 2);
//
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        ArrayList<String> arrayListString = new ArrayList<>();

//        PairGeneric.<Integer, Double>printX(1, 2.0);


        HashSet<Integer> set =
                new HashSet<>(List.of(1, 2, 4, 5, 3, 100, 2000, 1000, 5000, 500, 600));

        Set<Integer> set2 =
                new LinkedHashSet<>(List.of(1, 2, 4, 5, 3, 100, 2000, 1000, 5000, 500, 600));

        Set<Integer> set3 =
                new TreeSet<>(List.of(1, 2, 4, 5, 3, 100, 2000, 1000, 5000, 500, 600));

//        System.out.println(set);
//        System.out.println(set2);
//        System.out.println(set3);

        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.addAll(List.of(3,1 ,1));

        System.out.println(integers);


        Collections.sort(integers);

        System.out.println(integers);


    }
}

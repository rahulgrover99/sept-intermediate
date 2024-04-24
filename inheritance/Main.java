package inheritance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    static void doSomething(List<? extends User> users) {
        System.out.println(users.get(0).email);

        System.out.println(users);
    }

    static void doSomething2(List<? super Learner> users) {
        System.out.println(users);
    }

    public static void addToCollection(
            Collection<? super Number> collection, Integer element) {
        collection.add(element);
    }

    public static void main(String[] args) {

        Collection<Number> numberCollection = new ArrayList<>();
        addToCollection(numberCollection, 5);


        Collection<Object> objects = new ArrayList<>();
        objects.add("Hello");

        addToCollection(objects, 5);

        List<? super Number> list = new ArrayList<>();
        // List<Number>
        // List<Object>
//        list.add("J");
        Number x = 5.0;
        list.add(5.0);
        System.out.println(((Number)list.get(0)).intValue());
//        System.out.println(list.get(0).intValue());


//Object -> Number -> Integer
    }
}

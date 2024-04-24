package collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class MyClass implements Comparable<MyClass> {

    String name;
    Integer id;

    public MyClass(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(MyClass myClass) {
        if (this.name != myClass.name) {
            return myClass.name.compareTo(this.name);
        }
        return this.id - myClass.id;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

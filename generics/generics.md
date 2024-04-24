
## Generics
How can we represent pairs in java?

```java
class Coordinate {
    Double latitude;
    Double longitude;
}

class StudentData {
    Long id;
    String name;
}
```

In java, every class inherits from Object class
implicitly.


```java
class Pair {
    Object first;
    Object second;
    
    Object getFirst() {
        return first;
    }
    Object getSecond() {
        return second;
    }
}
```

Generics are parametrized data-types of attributes.
```java
class Box<E> {
    E ele1;
    E ele2;
    E ele3;
}
```

Raw types are simply introduced
for backward compatibility with Java version.

When you don't specify a type for generic,
it's equivalent to it being replaced by an Object 
type

```java
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
```


For static methods,
the class level parameterized types
might not be available when the static method 
gets called. 

To handle that, we can define generics for the
static method in a different way:

```java

static <X, Y> Y printX(X x) {
        System.out.println(x);
        return null;
    }
```
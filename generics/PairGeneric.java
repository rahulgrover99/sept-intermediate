package generics;

public class PairGeneric<T, U> {

    // 'generics.PairGeneric.this' cannot be referenced from a static context
//    static <X extends Number, Y extends Number> Y printX(X x, Y y) {
//        return (Number)x.intValue() + y.intValue();
//    }


    static <X extends Number> void getLogger(X x) {
        System.out.println(x.intValue());
        System.out.println(x.floatValue());
    }

    T first; // T would have been a double or a string ...

    U second;

    public PairGeneric(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public PairGeneric() {

    }


    T getfirst() {
        return first;
    }

    U getSecond() {
        return second;
    }
}

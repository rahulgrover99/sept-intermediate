package polymorphism;

public class Printer {

    void accept(A a) {
        a = null;
    }


    void print() {
        System.out.println("Hello");
    }

    int print(String a) {
        System.out.println("Hello, " + a);
        return 0;
    }


    int print(String a, String b) {
        return 0;
    }

    int print(double d) {
        return 1;
    }

    int print(float f) {
        return 1;
    }


}

package polymorphism;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        P obj = new C();
        System.out.println(obj.d1);
        System.out.println(obj.d);
        obj.fun1();
//        ((C)obj).fun2();
        obj.fun();
        obj.sfun();
        C.sfun();
    }
}

package dima.p310;

public class Callback {
    public static void main(String[] args) {
        Cally1 c1 = new Cally1();
        Cally2 c2 = new Cally2();
//        c1.increment();
        MyIncrement.f(c2);
        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallBackReference());
        caller1.go();
        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();
        caller2.go();
    }
}

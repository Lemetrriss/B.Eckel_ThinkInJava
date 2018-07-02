package dima.p304;

public class Outer {
    public void print(){
        Main.Nested nm = new Main.Nested();
        nm.print();
        System.out.println(getClass().getSimpleName());
    }

}

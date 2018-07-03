package dima.p306.ex1;

public class Main {
    public static void main(String[] args) {
        Inter.Inner in = new Inter.Inner("Abra");
        in.print();
        System.out.println(in.getClass().getSimpleName());
    }
}

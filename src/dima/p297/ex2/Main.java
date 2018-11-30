package dima.p297.ex2;

public class Main {
    public static void main(String[] args) {
        Destination destination = new Destination();
        Dest dest = destination.getDest(true);
        System.out.println(dest.getStr());
    }
}
package dima.p254.ex_13_1;

public class Main {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composings = new Composing[5];
        for (int i = 0; i < composings.length; i++) {
            composings[i] = new Composing(shared);
        }
        for (int i = composings.length-1; i >= 0; i--) {
            composings[i].dispose();
        }
        System.gc();
        new Composing(new Shared());
        System.gc();
    }
}

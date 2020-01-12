package dima.p916;

public class Main {
    public static void main(String[] args) {
        Sleeper a = new Sleeper(3000, "AAA");
        Sleeper b = new Sleeper(3000, "BBB");
        Joiner j = new Joiner(a, "Joiner1");
        Joiner jj = new Joiner(b, "Joiner2");
        b.t.interrupt();
    }
}

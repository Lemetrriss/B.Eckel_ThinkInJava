package dima.p304;

public class Main {
    private String str = "Hello Main";
    static class Nested implements Nestedeble{
        @Override
        public void print() {
            System.out.println(new Main().str);
        }
    }

    public static void main(String[] args) {
        Nestedeble n = new Nested();
        n.print();
        new Outer().print();
    }
}

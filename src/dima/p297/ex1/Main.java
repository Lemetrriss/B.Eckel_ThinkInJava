package dima.p297.ex1;

public class Main {

    public Interfaceble getInter() {
            class Inner implements Interfaceble {

                @Override
                public void tor() {
                    System.out.println("Hello");
                }
            }
            return new Inner();
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.getInter().tor();
    }
}

package dima.p301.ex2;
import dima.p297.Interfaceble;
public class Main {

    public Interfaceble getInter() {
        return new Interfaceble() {
            @Override
            public void tor() {
                System.out.println("Hello inner anonymous class");
            }
        };
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.getInter().tor();
    }
}

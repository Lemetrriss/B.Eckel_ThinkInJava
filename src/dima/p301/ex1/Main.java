package dima.p301.ex1;
import dima.p297.ex1.Interfaceble;

public class Main{
    private Interfaceble getInt(){
        return new Interfaceble() {
            @Override
            public void tor() {
                System.out.println("hello from Thor!");
            }
        };
    }

    public static void main(String[] args) {
        new Main().getInt().tor();
    }
}
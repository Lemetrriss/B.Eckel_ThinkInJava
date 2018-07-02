package dima.p295;

import dima.p295.dir2.Interfac;
import dima.p295.dir1.Outer;

public class Main extends Outer{

    public static void main(String[] args) {
        new Main().getInterfac().doJob("HELLO");
    }

    public Interfac getInterfac() {
        return new Inner();
    }
}

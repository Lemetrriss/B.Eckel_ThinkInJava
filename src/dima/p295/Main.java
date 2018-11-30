package dima.p295;

import dima.p295.dir2.Interface;
import dima.p295.dir1.Outer;

public class Main extends Outer{

    public static void main(String[] args) {
        new Main().getInterface().doJob("HELLO");
    }

    public Interface getInterface() {
        return new Inner();
    }
}

package dima.p295.dir1;

import dima.p295.dir2.Interfac;

public class Outer {
    protected class Inner implements Interfac{

        public Inner() {}

        @Override
        public void doJob(String s) {
            System.out.println(s + " " + getClass().getSimpleName());
        }
    }
}

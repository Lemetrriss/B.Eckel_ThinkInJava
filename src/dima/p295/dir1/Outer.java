package dima.p295.dir1;

import dima.p295.dir2.Interface;

public class Outer {
    protected class Inner implements Interface{

        public Inner() {}

        @Override
        public void doJob(String s) {
            System.out.println(s + " " + getClass().getSimpleName());
        }
    }
}

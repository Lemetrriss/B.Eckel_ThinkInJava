package dima.p919.part2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
//        ExecutorService es = Executors.newCachedThreadPool(new OurThreadFactory());
//        es.execute(new OurProcess());
//        es.shutdown();
        Thread t = new Thread(new OurProcess());
        Thread.setDefaultUncaughtExceptionHandler(new OurUncaughtExceptionHandler());
        t.start();
    }
}

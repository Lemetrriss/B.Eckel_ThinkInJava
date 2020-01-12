package dima.p919;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool(new MyThreadFactory());
        es.execute(new MyExceptionHandler());
        es.shutdown();
    }
}

package dima.p902;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Priority {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i<5; i++)
            es.execute(new TestPriority(Thread.MIN_PRIORITY));
        es.execute(new TestPriority(Thread.MAX_PRIORITY));
        es.shutdown();
    }
}

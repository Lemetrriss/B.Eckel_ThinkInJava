package dima.p900;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    private static int i = 5;
    public static void main(String[] args) {
        List<Future<String>> list = new ArrayList<>();
        ExecutorService es = Executors.newCachedThreadPool();
        while (i-->0) {
            list.add(es.submit(new TestCall()));
        }
        es.shutdown();
        for(Future<String> f : list) {
            try {
                System.out.println(f.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
    }

}

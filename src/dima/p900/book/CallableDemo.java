package dima.p900.book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(5);
        List<Future<String>> list = new ArrayList<>();
        for(int i=0; i<5; i++) {
            list.add(exec.submit(new TaskWithResults(i)));
        }
        exec.shutdown();
        for (Future<String> stringFuture : list) {
            try {
                System.out.println(stringFuture.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            } catch (ExecutionException e) {
                e.printStackTrace();
            } finally {
                exec.shutdown();
            }
        }
    }
}

package dima.p900.ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Future<List<Long>>> list = new ArrayList<>();
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 8; i<11; i++) {
            list.add(exec.submit(new CallableDem(i)));
        }
        exec.shutdown();
        long summ = 0;
        for (Future<List<Long>> listFuture : list) {
            try {
                List<Long> longs = listFuture.get();
                for(Long l : longs)
                    summ+=l;
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.println(summ);
    }
}

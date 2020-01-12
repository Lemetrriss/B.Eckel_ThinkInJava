package dima.p913;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FibonachiMethodThread {
    private String name;
    private static int num;
    private FibonachiMethodThread(String name) {
        this.name = name;
    }

    private Future<List<Long>> runFibonachi(int i){
        ExecutorService es = Executors.newCachedThreadPool();
        Future<List<Long>> submit = es.submit(new Callable<>() {
            List<Long> list = new ArrayList<>();

            @Override
            public List<Long> call() {
                list.add(0L);
                count(0, 1, i - 1);
                return list;
            }

            private void count(long a, long b, int size) {
                list.add(b);
                if (--size > 0)
                    count(b, a + b, size);
            }

            @Override
            public String toString() {
                return name + ++num;
            }
        });
        es.shutdown();
        return submit;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Future<List<Long>>> list = new ArrayList<>();
        for (int i=3; i<50; i++)
            list.add(new FibonachiMethodThread("FiboThread").runFibonachi(i));
        System.out.println(list);
        long total = 0;
        for (Future<List<Long>> f : list) {
            long summ = 0;
            List<Long> longs = f.get();
            for (Long l : longs){
                summ+=l;
                System.out.print(l+", ");
            }
            total+=summ;
            System.out.print("Summ = "+summ);
            System.out.println();
        }
        System.out.println("Total = "+total);
    }
}

package dima.p896.ex2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        int count = 5;
        while (count-->0)
            executorService.execute(new Fibo(5));
        executorService.shutdown();
    }
}

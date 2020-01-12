package dima.p906;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main implements Runnable{

    @Override
    public void run() {
        while (true) {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }
            System.out.println(Thread.currentThread() + " : " + this);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newCachedThreadPool(new DaemonFactory());
        for (int i=0; i<10; i++){
            es.execute(new Main());
        }
        System.out.println("All daemons started");
        TimeUnit.MILLISECONDS.sleep(600);
    }
}

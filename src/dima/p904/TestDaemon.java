package dima.p904;

import java.util.concurrent.TimeUnit;

public class TestDaemon implements Runnable {
    @Override
    public void run() {
        while (true){
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("sleep() interrupted");
            }
            System.out.println(Thread.currentThread() + " " + this);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i<10; i++){
            Thread t = new Thread(new TestDaemon());
            t.setDaemon(true);
            t.start();
        }
        System.out.println("All daemons started");
        TimeUnit.MILLISECONDS.sleep(115);
    }
}

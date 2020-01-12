package dima.p900;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class TestCall implements Callable<String> {
    private static int count = 0;
    private final int id = count++;
    @Override
    public String call() {
        for(int i=0; i<10; i++) {
            System.out.println(id + "" + i);
            try {
                TimeUnit.MILLISECONDS.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "My test #"+id;
    }
}
package dima.p919.part2;

import java.util.concurrent.ThreadFactory;

public class OurThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setUncaughtExceptionHandler(new OurUncaughtExceptionHandler());
        return t;
    }
}

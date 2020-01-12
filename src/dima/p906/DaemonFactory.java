package dima.p906;

import java.util.concurrent.ThreadFactory;

public class DaemonFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}

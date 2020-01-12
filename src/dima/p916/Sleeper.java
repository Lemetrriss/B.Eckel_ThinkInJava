package dima.p916;

public class Sleeper implements Runnable {
    private int sleep;
    Thread t;
    Sleeper(int sleep, String name) {
        t = new Thread(this, name);
        this.sleep = sleep;
        t.start();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            System.out.println(t + " : Was interrupted : " + t.isInterrupted());
            return;
        }
        System.out.println(t + " : awaken");
    }
}

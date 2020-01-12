package dima.p916;

public class Joiner implements Runnable {
    private Thread thread;
    private Sleeper s;
    Joiner(Sleeper s, String name) {
        this.s = s;
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread() + " Started");
            s.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

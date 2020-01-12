package dima.p902;

public class TestPriority implements Runnable {
    private static int c;
    private int priority;
    private volatile double d;
    private int count = 5;

    TestPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return Thread.currentThread() + " : " + count;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        while (true){
            for (int i=0; i<100000; i++) {
                d += Math.sqrt((Math.PI + Math.E) / (double) i+d);
                if(i%1000==0)
                    Thread.yield();
            }
            System.out.println(c+++") "+this);
            if (count--==0)
                return;
        }
    }
}

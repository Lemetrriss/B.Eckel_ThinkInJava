package dima.p911;

public class InnerRunnable {
    private int countDown = 5;
    private Thread thread;
    private InnerRunnable(String s) {
        thread = new Thread(new Runnable() {

            @Override
            public String toString() {
                return thread.getName() + " (" + countDown + ")";
            }

            @Override
            public void run() {
                while (true){
                    System.out.println(this);
                    if (--countDown==0)
                        return;
                }
            }
        },s);
        thread.start();
    }

    public static void main(String[] args) {
        for (int i=0; i<5; i++)
            new InnerRunnable("Thread:"+i);
    }
}
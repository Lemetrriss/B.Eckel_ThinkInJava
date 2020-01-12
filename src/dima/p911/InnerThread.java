package dima.p911;

public class InnerThread {
    private Thread t;
    private int countDown = 5;
    private InnerThread(String name) {
        t = new Thread(name){
            public void run(){
                while (true){
                    System.out.println(this+" - in - "+InnerThread.this);
                    yield();
                    if (--countDown==0)
                        return;
                }
            }

            @Override
            public String toString() {
                return getName()+" ("+countDown+")";
            }
        };
        t.start();
    }

    public static void main(String[] args) {
        for (int i=0; i<5; i++)
            new InnerThread("Hallo");
    }
}

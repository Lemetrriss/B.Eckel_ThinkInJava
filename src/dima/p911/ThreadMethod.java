package dima.p911;

public class ThreadMethod {
    private int countDown = 5;
    private String name;
    private Thread t;

    private ThreadMethod(String name) {
        this.name = name;
    }

    private void runTask(){
        if (t==null){
            t = new Thread(name){
                public void run(){
                    while (true){
                        System.out.println(this);
                        if (--countDown==0)
                            return;
                    }
                }
                public String toString(){
                    return getName()+" ("+countDown+")";
                }
            };
        }
        t.start();
    }

    public static void main(String[] args) {
        new ThreadMethod("MyMethodThread").runTask();
    }
}

package dima.p896.ex2;

public class Fibo implements Runnable{
    private int size;
    Fibo(int size) {
        this.size = size;
    }

    private void count(long a, long b, int count){
        System.out.print(a+b+" ");
        if (count-->=0) {
            count(b, (a+b), count);
            Thread.yield();
        }
    }

    @Override
    public void run() {
        count(0,1,size);
    }
}

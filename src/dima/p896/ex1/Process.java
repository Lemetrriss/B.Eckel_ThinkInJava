package dima.p896.ex1;

public class Process implements Runnable {

    private int i;

    Process(int i) {
        this.i = i;
        System.out.println("Start process #" + i);
    }

    @Override
    public void run() {
        int count = 3;
        while (count>0){
            System.out.println("Inside run #" + i + " : " + count--);
            Thread.yield();
        }
        System.out.println("Outside \"run\" #" + i);
    }
}

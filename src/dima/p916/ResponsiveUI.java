package dima.p916;

import java.io.IOException;

public class ResponsiveUI extends Thread{
    private static volatile int d;

    private ResponsiveUI() {
        setDaemon(true);
        start();
    }

    public void run(){
        while(true){
            d+=(Math.PI + Math.E) / d;
        }
    }

    public static void main(String[] args) throws IOException {
        new ResponsiveUI();
        int read = System.in.read();
        System.out.println(d);
    }
}

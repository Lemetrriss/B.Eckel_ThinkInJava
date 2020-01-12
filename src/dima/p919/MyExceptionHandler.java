package dima.p919;

import javax.sound.midi.Soundbank;

public class MyExceptionHandler implements Runnable {

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println("Run by " + thread);
        System.out.println("Inside run : " + thread.getUncaughtExceptionHandler());
        throw new RuntimeException();
    }
}

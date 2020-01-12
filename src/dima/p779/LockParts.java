package dima.p779;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;

public class LockParts {
    private FileChannel fc;
    private MappedByteBuffer mbb;
    private LockParts(FileChannel fc) throws IOException {
        this.fc = fc;
        mbb = fc.map(FileChannel.MapMode.READ_WRITE, 0, fc.size());
    }

    class Potok extends Thread{
        private char c;
        private int start, end;
        ByteBuffer bb;
        Potok(int start, int end, char c) {
            this.c = c;
            this.start = start;
            this.end = end;
            mbb.position(start);
            mbb.limit(end);
            bb = mbb.slice();
            setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
            start();
        }

        public void run(){
            try {
                FileLock fileLock = fc.lock(start, end-start, false);
                System.err.println("Position = "+bb.position()+", Capacity = "+bb.capacity()+", limit = "+bb.limit());
                while (bb.hasRemaining()) {
                    bb.put((byte) c);
                }
                bb.rewind();
                while (bb.hasRemaining()){
                    System.out.println((char)bb.get());
                }
                sleep(2900);
                System.out.println(fileLock.isValid());
                fileLock.release();
                fileLock.close();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {

        LockParts lp = new LockParts(new RandomAccessFile("123.go", "rw").getChannel());
        lp.new Potok(0, 10, 'a');
        lp.new Potok(10, 20, 'b');
        TimeUnit.SECONDS.sleep(1);

        ByteBuffer allocate = ByteBuffer.allocate(20);
        lp.fc.write(allocate);
        allocate.rewind();
        while (allocate.hasRemaining()) {
            allocate.put((byte) 'x');
        }
        allocate.rewind();
        while (allocate.hasRemaining()){
            System.out.println((char)allocate.get());
        }
        TimeUnit.SECONDS.sleep(2);
        lp.fc.close();
    }
}

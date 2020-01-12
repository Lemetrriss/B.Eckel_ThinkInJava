package dima.p778;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class LockOper2 {
    private FileChannel fc;
    private static MappedByteBuffer mbb;
    private LockOper2() throws IOException {
        fc = new RandomAccessFile("123.go", "rw").getChannel();
        mbb = fc.map(FileChannel.MapMode.READ_WRITE, 0, fc.size());
    }

    public static void main(String[] args) throws IOException {
        LockOper2 lo2 = new LockOper2();
        FileLock fileLock = lo2.fc.tryLock();
        int read = lo2.fc.read(mbb);
        System.out.println(read);
        mbb.rewind();
        while (mbb.hasRemaining()){
            System.out.print((char)mbb.get());
        }
        System.out.println("\n"+fileLock.isValid());
        fileLock.release();
        System.out.println("\n"+fileLock.isValid());
        fileLock.close();
        lo2.fc.close();
    }

}
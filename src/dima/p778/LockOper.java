package dima.p778;

import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;

public class LockOper {
    public static void main(String[] args) {
        try (FileChannel channel = new FileOutputStream("123.go").getChannel()) {
            FileLock fileLock = channel.tryLock();
            if (fileLock != null) {
                System.out.println("Our file is locked");
                TimeUnit.SECONDS.sleep(2);
                fileLock.release();
                System.out.println("File was released");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Chanel closed");
        }
    }
}

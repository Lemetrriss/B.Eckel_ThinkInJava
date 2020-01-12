package dima.p775;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MappedBuffer {
    private static long length = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        MappedByteBuffer mbb = new RandomAccessFile("111.txt", "rw").getChannel()
                .map(FileChannel.MapMode.READ_WRITE, 0, length);
        while (mbb.hasRemaining())
            mbb.put((byte)'x');
    }
}

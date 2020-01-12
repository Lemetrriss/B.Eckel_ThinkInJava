package dima.p775;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MappedBuffer2 {
    public static void main(String[] args) throws IOException {
        MappedByteBuffer map = new RandomAccessFile("123.go", "rw")
                .getChannel()
                .map(FileChannel.MapMode.READ_WRITE, 104857600, Integer.MAX_VALUE);
        while (map.hasRemaining())
            map.put((byte)'w');
    }
}

package dima.p781;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.zip.*;

public class GZipMain {
    public static void main(String[] args) throws IOException {
        File f = new File(args[1]);
        ByteBuffer bb = ByteBuffer.allocate((int) f.length());
        FileChannel channel = new FileInputStream(f).getChannel();
        int read = channel.read(bb);
        channel.close();
        System.out.println(read);
        bb.rewind();
        System.out.println("Position: " + bb.position() + ", Limit: " + bb.limit() + ", Capasity: " + bb.capacity());
        CharBuffer cb = Charset.forName(System.getProperty("file.encoding")).decode(bb);
        System.out.println("Position: " + bb.position() + ", Limit: " + bb.limit() + ", Capasity: " + bb.capacity());
        cb.rewind();
        BufferedOutputStream bufferedOutputStream =
                                                    new BufferedOutputStream(
                                                            new GZIPOutputStream(
                                                                    new FileOutputStream(args[0])));

        while (cb.hasRemaining()) {
            bufferedOutputStream.write(cb.get());
        }
        bufferedOutputStream.close();

        BufferedReader bufferedReader =
                                        new BufferedReader(
                                                new InputStreamReader(
                                                        new GZIPInputStream(
                                                                new BufferedInputStream(
                                                                        new FileInputStream("123.gz")))));
        String s;
        while ((s = bufferedReader.readLine()) != null)
            System.out.println(s);

    }
}

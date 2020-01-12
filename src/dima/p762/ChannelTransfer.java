package dima.p762;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Arrays;

public class ChannelTransfer {
    public static void main(String[] args) throws IOException {
        ByteBuffer buff = ByteBuffer.allocate(1000);
        FileChannel
            in = new FileInputStream(args[0]).getChannel(),
            out = new FileOutputStream(args[1]).getChannel();
        out.position(out.size());
        out.transferFrom(in,0, in.size());
        in.position(0);
        in.read(buff);
        buff.flip();
        System.out.println(Arrays.toString(buff.array()));
        System.out.println(in.size());
        System.out.println(out.size());
        in.close();
        out.close();
        in = new FileInputStream("d:\\newFile.txt").getChannel();
        in.read(buff);
        buff.flip();
        System.out.println(buff.asCharBuffer());
        buff.rewind();
        String property = System.getProperty("file.encoding");
        System.out.println("Print using" + property + " - \n" + Charset.forName(property).decode(buff));
    }
}

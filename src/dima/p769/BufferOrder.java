package dima.p769;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;

public class BufferOrder {
    public static void main(String[] args) {
        ByteBuffer b = ByteBuffer.wrap(new byte[12]);
        b.asCharBuffer().put("фбвгдэ");
        System.out.println(Arrays.toString(b.array()));
        b.rewind();
//        Charset charset = Charset.forName(System.getProperty("file.encoding"));
//        b.order(ByteOrder.LITTLE_ENDIAN).put("фбвгдэ".getBytes(charset));
        b.order(ByteOrder.LITTLE_ENDIAN);
        b.asCharBuffer().put("фбвгдэ");
        System.out.println(Arrays.toString(b.array()));
    }
}

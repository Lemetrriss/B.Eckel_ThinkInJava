package dima.p766;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Properties;

public class Main3 {
    public static void main(String[] args) throws IOException {
        FileChannel fc = new FileInputStream("111.txt").getChannel();
        ByteBuffer b = ByteBuffer.allocate(124);
        fc.read(b);
        b.flip();
        Properties properties = System.getProperties();
        for(Map.Entry s : properties.entrySet()){
            System.out.format("Key: %-35s, Value: %s\n", s.getKey(), s.getValue());
        }

        String property = System.getProperty("file.encoding");
        CharBuffer decode = Charset.forName(property).decode(b);
        System.out.println(decode);
    }
}

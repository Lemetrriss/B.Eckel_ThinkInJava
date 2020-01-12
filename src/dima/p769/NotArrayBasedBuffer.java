package dima.p769;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.Arrays;

public class NotArrayBasedBuffer {
    public static void main(String[] args) {
//        ByteBuffer b = ByteBuffer.allocate(10);
        CharBuffer cb = CharBuffer.allocate(10);
        char c = 'a';
//        byte i = 0;
        while(cb.hasRemaining())
            cb.put(c++);
        System.out.println(Arrays.toString(cb.array()));
    }
}

package dima.p771;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class SymmetricScramble {
    private static void symmetricScrumble(CharBuffer b){
        while (b.hasRemaining()) {
            b.mark();
            char c1 = b.get();
            char c2 = b.get();
            b.reset();
            b.put(c2).put(c1);
        }
    }

    public static void main(String[] args) {
        char[] c = "hallo world!".toCharArray();
        ByteBuffer bb = ByteBuffer.allocate(c.length*2);
        CharBuffer cb = bb.asCharBuffer();
        cb.put(c);
        System.out.println(cb.rewind());
        symmetricScrumble(cb);
        System.out.println(cb.rewind());
        symmetricScrumble(cb);
        System.out.println(cb.rewind());
    }
}

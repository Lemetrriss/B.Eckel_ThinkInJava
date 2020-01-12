package dima.p767;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class Main {
    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.allocate(100);
        IntBuffer intBuffer = bb.asIntBuffer();
        intBuffer.put(new int[]{10,20,30,40,50,60,70,80,90});
        intBuffer.put(3, 87878);
        intBuffer.rewind();
        System.out.println(bb.capacity());
        while (bb.hasRemaining())
            System.out.print(bb.get());
        System.out.println();
        System.out.println(intBuffer.capacity());
        while (intBuffer.hasRemaining())
            System.out.print(intBuffer.get());
        System.out.println();
        bb.rewind();
        System.out.println(bb.capacity());
        while (bb.hasRemaining())
            System.out.print(bb.get());
    }
}

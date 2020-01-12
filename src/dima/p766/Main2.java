package dima.p766;

import java.nio.ByteBuffer;

public class Main2 {
    public static void main(String[] args) {
        ByteBuffer buf = ByteBuffer.allocate(12);
        buf.put(new byte[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100});
        System.out.println(buf.limit());
        buf.flip();
        System.out.println(buf.limit());
        while (buf.hasRemaining()) {
            System.out.print("[" + buf.position() + "-" + buf.get() + "] ");
        }
        System.out.println();
        buf.clear();
        System.out.println(buf.capacity());
        System.out.println(buf.limit());
        buf.put(new byte[]{5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 60});
        buf.flip();
        System.out.println();
        while (buf.hasRemaining()) {
            System.out.print("[" + buf.position() + "-" + buf.get() + "] ");
        }
    }
}

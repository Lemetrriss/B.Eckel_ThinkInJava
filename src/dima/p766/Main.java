package dima.p766;

import java.nio.ByteBuffer;

public class Main {
    public static void main(String[] args) {
        ByteBuffer allbuf = ByteBuffer.allocate(1024);
        int i = 0;
        while (i++ < allbuf.limit())
            if (allbuf.get() != 0)
                System.out.println("NOTnull");
        System.out.println(i);
        allbuf.rewind();
        allbuf.asCharBuffer().put("jsbviursbv");
        char c;
        while ((c = allbuf.getChar()) != 0)
            System.out.print(c);
        System.out.println();
        allbuf.clear();
        allbuf.asShortBuffer().put((short)471142);
//        System.out.println(allbuf.getShort());
//        System.out.println(allbuf.getShort());
//        System.out.println(allbuf.getShort());
        System.out.println(allbuf.getChar());
        System.out.println(allbuf.getChar());
        System.out.println(allbuf.getChar());
    }
}

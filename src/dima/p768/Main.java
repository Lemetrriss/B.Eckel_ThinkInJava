package dima.p768;

import java.nio.*;

public class Main {
    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.wrap(new byte[]{0,0,0,0,0,0,0,'a'});
        System.out.println("Byte Buffer:");
        while (bb.hasRemaining())
            System.out.print(bb.position() + ") " + bb.get() + ", ");
        System.out.println();
        System.out.println("Char Buffer:");
        CharBuffer cb = bb.rewind().asCharBuffer();
        while(cb.hasRemaining())
            System.out.print(cb.position() + ") " + cb.get() + ", ");
        System.out.println();
        System.out.println("Short Buffer:");
        ShortBuffer sb = bb.rewind().asShortBuffer();
        while(sb.hasRemaining())
            System.out.print(sb.position() + ") " + sb.get() + ", ");
        System.out.println();
        System.out.println("Integer Buffer:");
        IntBuffer intb = bb.rewind().asIntBuffer();
        while(intb.hasRemaining())
            System.out.print(intb.position() + ") " + intb.get() + ", ");
        System.out.println();
        System.out.println("Long Buffer:");
        LongBuffer lb = bb.rewind().asLongBuffer();
        while(lb.hasRemaining())
            System.out.print(lb.position() + ") " + lb.get() + ", ");
        System.out.println();
        System.out.println("Float Buffer:");
        FloatBuffer fb = bb.rewind().asFloatBuffer();
        while(fb.hasRemaining())
            System.out.print(fb.position() + ") " + fb.get() + ", ");
        System.out.println();
        System.out.println("Double Buffer:");
        DoubleBuffer db = bb.rewind().asDoubleBuffer();
        while(db.hasRemaining())
            System.out.print(db.position() + ") " + db.get() + ", ");
        System.out.println();
    }
}

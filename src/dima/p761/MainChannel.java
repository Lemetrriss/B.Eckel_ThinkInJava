package dima.p761;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class MainChannel {
    public static void main(String[] args) {
        ByteBuffer buff = ByteBuffer.allocate(10);
        FileChannel fl;
        try {
            fl = new FileInputStream("d:\\05.11.19.txt").getChannel();
            System.out.println(fl.position());
            while(fl.read(buff) != -1){
                for(byte b:buff.array())
                    System.out.print((char)b+" ");
                buff.clear();
                System.out.println();
            }
            System.out.println(fl.position());
            fl.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        buff.flip();
        while (buff.hasRemaining()) {
            char c = (char)buff.get();
            System.out.print(c);
        }
        buff.flip();
        int i = 0;
        try {
            fl = new RandomAccessFile("111222333.txt", "rw").getChannel();
//            long size = fl.size();
            System.out.println();
            fl.position(fl.size());
            i = fl.write(buff);
            System.out.println(i);
            fl.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File f = new File("d:\\111222333.txt");
//        int j;
        try(Reader r = new FileReader(f)) {
//            while ((j = r.read()) != -1){
            for(int k = 0; k<i; k++){
                    System.out.print((char)r.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

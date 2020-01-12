package dima;


import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main2 {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress a = InetAddress.getByName("sortir.mk.ua");
//        System.out.println(a);

        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream o = new ObjectOutputStream(out);
            o.writeObject(a);
            o.flush();
            o.close();

            ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(out.toByteArray()));
            InetAddress read = (InetAddress)in.readObject();
            System.out.println(read);
            byte[] address = read.getAddress();
            for (byte b:address)
                System.out.println(b);
            System.out.println(read.getHostAddress());
            System.out.println(read.getHostName());
            System.out.println(read.toString());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

package dima.p790.folder;

import java.io.*;
import java.net.URL;

public class Deserial {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("serialization.ser")));
        Object o1 = ois.readObject();
        Object o2 = ois.readObject();
        ois.close();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1.getClass());
        System.out.println(o2.getClass());
    }
}

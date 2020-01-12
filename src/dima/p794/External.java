package dima.p794;

import java.io.*;

public class External {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Blip b = new Blip("Blip", 1);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("123"));
        oos.writeObject(b);
        oos.close();
        System.out.println(b);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("123"));
        Blip o = (Blip) ois.readObject();
        System.out.println(o);
    }
}

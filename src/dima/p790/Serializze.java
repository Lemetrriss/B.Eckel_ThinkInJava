package dima.p790;

import java.io.*;
import java.util.Random;

public class Serializze implements Serializable {
    private Random r = new Random(47);
    private char c;
    private int i;
    private Serializze s;
    private Data[] d;

    private Serializze(int i, char c) {
        d = new Data[i];
        for (int j = i; j>0; j--)
            d[j-1] = new Data(r.nextInt(10));
        System.out.println("Serializze constructor: "+i);
        this.i = i;
        this.c = c;
        if (--i>0){
            s = new Serializze(i, (char)(c + 1));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Serializze {");
        for (Data dat : d){
            sb.append(dat).append(", ");
        }
        sb.append("}");
        return sb.toString();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Serializze ser = new Serializze(6, 'g');
        System.out.println(ser);
        FileOutputStream fos = new FileOutputStream("serialization.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject("Serializze object:");
        oos.writeObject(ser);
        oos.close();
        FileInputStream fis = new FileInputStream("serialization.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        String string = (String) ois.readObject();
        Object serializze = ois.readObject();
        ois.close();
        System.out.println(string+"\n"+serializze);
    }
}

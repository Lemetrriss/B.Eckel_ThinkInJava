package dima.p794;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Blip implements Externalizable {
    private String s;
    private int i;

    public Blip() {
    }

    Blip(String s, int i) {
        this.s = s;
        this.i = i;
    }

    @Override
    public String toString() {
        return "Blip{" + s  + i + '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(s);
        out.writeInt(i);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        s = (String) in.readObject();
        i = in.readInt();
    }
}

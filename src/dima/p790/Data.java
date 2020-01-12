package dima.p790;

import java.io.Serializable;

public class Data implements Serializable {
    private int i;
    Data(int i) {
        this.i = i;
    }
    @Override
    public String toString() {
        return  "data=" + i;
    }
}

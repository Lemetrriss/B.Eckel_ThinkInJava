package dima.p274;

import java.util.Arrays;

class StrSplit extends Excercise11Main {
    double id;

    public StrSplit(double id) {
        this.id = id;
    }

    @Override
    public String process(Object o) {
        return Arrays.toString(((String)o).split(" "));
    }

    @Override
    public String toString() {
        return "StrSplit{" +
                "id=" + id +
                '}';
    }
}

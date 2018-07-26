package dima.p336;

import java.util.*;

public class Main {
    private int i;

    @Override
    public String toString() {
        return "Main{" +
                "i=" + i +
                '}';
    }

    public Main(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        Main[] mains = new Main[10];
        for (int i = 0; i < 10; i++) {
            mains[i] = new Main(i);
        }
        List<Main> list = new ArrayList<>();
//        Collections.addAll(list, mains);
        list.addAll(Arrays.asList(mains));
        System.out.println(list);
        List sub = list.subList(3, 8);
        System.out.println(sub);
        list.removeAll(sub);
        System.out.println(list);
    }
}

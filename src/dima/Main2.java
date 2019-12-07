package dima;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Main2 {
    private int[] arr = {1,2,3,4,5,6,7,8,9,0};
    private List<Integer> list = new ArrayList<>(10);

    public static void main(String[] args) {
        Main2 m = new Main2();
        for (int i=0; i<10; i++)
            m.list.add(m.list.size()/2, m.arr[i]);
        m.list.forEach(System.out::print);
    }
}

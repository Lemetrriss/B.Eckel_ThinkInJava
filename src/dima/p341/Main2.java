package dima.p341;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class Main2 {
    private LinkedList<Integer> lit = new LinkedList<>();

    private void add(Integer i){
        ListIterator<Integer> integerListIterator = lit.listIterator(lit.size()/2);
        integerListIterator.add(i);
    }

    public static void main(String[] args) {
        Main2 m = new Main2();
        Integer[] i = {1,2,3,4,5,6,7,8,9,};
        for(int j = 0; j < i.length; j++)
            m.add(i[j]);
        System.out.println(m.lit);
        System.out.println(m.lit.get(0));
        System.out.println(1 / 2);
    }
}

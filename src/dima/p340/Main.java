package dima.p340;

import java.util.*;

public class Main {

    private static void reverse(List<Integer> col){
        ListIterator<Integer> list1 = col.listIterator();
        ListIterator<Integer> list2 = col.listIterator(col.size());
        for (int i = 0; i < col.size() >> 1; i++) {
            Integer tmp = list1.next();
            list1.set(list2.previous());
            list2.set(tmp);
        }
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        List<Integer> l2 = new LinkedList<>();
        l2.addAll(l1);
        System.out.println(l1);
        System.out.println(l2);
        reverse(l2);
        System.out.println();
        System.out.println(l1);
        System.out.println(l2);
    }
}

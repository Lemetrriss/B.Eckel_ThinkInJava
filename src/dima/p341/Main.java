package dima.p341;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        ListIterator<Integer> it = list.listIterator();
        for (int i = 4; i < 6; i++) {
            list2.add(i, i*10);
        }
        for (int i = 1; i <= 10; i++) {
            it.add(i);
            if(i%2==0)
                it.previous();
        }
        System.out.println(list);
        System.out.println(list.get(5));
        System.out.println(list2);
    }
}
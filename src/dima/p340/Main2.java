package dima.p340;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        List<Integer> revList = rev(list);
        System.out.println(list);
        System.out.println(revList);
    }

    private static List<Integer> rev(List<Integer> l){
        ListIterator<Integer> li = l.listIterator(l.size());
        List<Integer> list = new ArrayList<>();
        while (li.hasPrevious()){
            list.add(li.previous());
        }
        return list;
    }
}

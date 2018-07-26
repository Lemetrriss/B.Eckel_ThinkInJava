package dima.p327;

import java.util.*;

public class Gerbil {
    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }
    void hop(){
        System.out.println("Number of gebril: " + gerbilNumber);
    }

    public static void main(String[] args) {
        Collection<Gerbil> list = new ArrayList<>();
        list.add(new Gerbil(1));
        list.add(new Gerbil(2));
        list.add(new Gerbil(3));
        list.add(new Gerbil(4));
        Collections.addAll(list, new Gerbil(5), new Gerbil(6), new Gerbil(7),
                new Gerbil(8), new Gerbil(9), new Gerbil(10));
        for (Iterator<Gerbil> it = list.iterator(); it.hasNext();) {
            Gerbil g = it.next();
            g.hop();
            if(g.gerbilNumber >7)
                it.remove();
        }
        System.out.println(list);
        Collection<Integer> col = new ArrayList<>();
        col.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(((ArrayList<Integer>) col).get(1));

    }
}

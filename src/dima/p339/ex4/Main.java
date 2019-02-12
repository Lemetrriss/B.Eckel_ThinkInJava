package dima.p339.ex4;

import dima.p332.Generator2;

import java.util.*;

public class Main {
    private void iterate(Iterator it){
        while (it.hasNext()) System.out.print(it.next().toString()+", ");
        System.out.println();
    }
    private Iterator fill(Collection col){
        return Generator2.gen(col).iterator();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.iterate(main.fill(new ArrayList()));
        main.iterate(main.fill(new LinkedList()));
        main.iterate(main.fill(new HashSet()));
        main.iterate(main.fill(new TreeSet()));
        main.iterate(main.fill(new LinkedHashSet()));
    }
}
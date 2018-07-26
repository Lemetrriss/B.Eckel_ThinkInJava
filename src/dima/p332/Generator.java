package dima.p332;

import java.util.*;

class NameGenerator {
    String[] names = new String[]{"Grumpy", "Happy", "Prince", "Dopey", "Doc", "Sneezy",
            "Grumpy", "Snow White", "Witch Queen", "Prince"};
    int x;
    public String next(){
        String str = names[x];
        x = (x+1)%names.length;
        return str;
    }
}

class Main{
    private static NameGenerator nm = new NameGenerator();
    private static String[] fill(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nm.next();
        }
        return arr;
    }
    private static Collection<String> fill(Collection<String> col){
        for (int i = 0; i<nm.names.length; i++){
            col.add(nm.next());
        }
        return col;
    }

    public static void main(String[] args) {

        System.out.printf("%25s%n", "Array: "+Arrays.toString(fill(new String[10])));
        System.out.printf("%25s%n", "ArrayList: "+fill(new ArrayList<>()));
        System.out.printf("%25s%n", "LinkedList: "+fill(new LinkedList<>()));
        System.out.printf("%25s%n", "HashSet: "+fill(new HashSet<>()));
        System.out.printf("%25s%n", "LinkedHashSet: "+fill(new LinkedHashSet<>()));
        System.out.printf("%25s%n", "TreeSet: "+fill(new TreeSet<>()));
    }
}
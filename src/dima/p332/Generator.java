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

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(nm.names));
        ListIterator<String> stringListIterator = arrayList.listIterator();
        while (stringListIterator.hasNext()) {
//            System.out.print(stringListIterator.next());
            System.out.println(stringListIterator.nextIndex());
        }

//        Collection <String> l = fill(new ArrayList<>());
//        Iterator<String> iterator = l.iterator();
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            System.out.println(next);
//        }

        System.out.printf("Array: %25s%n", Arrays.toString(fill(new String[10])));
        System.out.printf("ArrayList: %25s%n", fill(new ArrayList<>()));
        System.out.printf("LinkedList: %25s%n", fill(new LinkedList<>()));
        System.out.printf("HashSet: %25s%n", fill(new HashSet<>()));
        System.out.printf("LinkedHashSet: %25s%n", fill(new LinkedHashSet<>()));
        System.out.printf("TreeSet: %25s%n", fill(new TreeSet<>()));
    }
}
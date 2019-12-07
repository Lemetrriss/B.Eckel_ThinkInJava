package dima.p332;

//import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.*;

public class Generator2 {
    private static String[] act = new String[]{"James", "John", "Nikolas", "Antony", "Mark",};
    public static Collection<String> gen(Collection<String> col){
        Collections.addAll(col, act);
//        col.addAll(Arrays.asList(act));
        return col;
    }
    private static Collection<String> gen(String[] strArr){
        Collection<String> col = Arrays.asList(strArr);
        return col;
    }

    private static void next(Collection<String> col){
        System.out.println(col.getClass().getSimpleName() + ":" + col);
    }

    public static void main(String[] args) {
      //  Generator2 g = new Generator2();
        next(gen(act));
        next(gen(new ArrayList<String>()));
        next(gen(new LinkedList<String>()));
        next(gen(new HashSet<String>()));
        next(gen(new TreeSet<String>()));
        next(gen(new LinkedHashSet<String>()));
    }
}

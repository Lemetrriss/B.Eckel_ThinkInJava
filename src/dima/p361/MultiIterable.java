package dima.p361;

import com.sun.source.tree.Tree;

import java.util.*;

public class MultiIterable implements Iterable<String>{

    private static String[] str = "Иллюстрированное, пособие, для, программистов, и, любопытствующих".split("\\s*,\\s*");


    Comparator com = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    };


    public static void main(String[] args) {
        MultiIterable m = new MultiIterable();
        NavigableSet<String> s = new TreeSet<>(Arrays.asList(str));
        SortedSet<String> ss = s.headSet("и");
        System.out.println(ss);
        System.out.println(s);


        List<String> list = new ArrayList<>(Arrays.asList(str));
        mapping();

//        for (String s:m) {
//            System.out.println(s);
//        }

//        for (String s:m.reverse()) {
//            System.out.println(s);
//        }

//        for (String s : m.shuffle()) {
//            System.out.println(s);
//        }
    }

    private static void mapping() {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length; i++) {
            map.put(str[i], i);
        }
        for (Map.Entry<String, Integer> mm : map.entrySet()){
            String key = mm.getKey();
            Integer value = mm.getValue();
            new Formatter(System.out).format("For string key: %-20s our value is %d%n",key, value);
        }
    }


    private Iterable<String> shuffle(){
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                ArrayList<String> list = new ArrayList<>(Arrays.asList(str));
                Collections.shuffle(list, new Random(47));
                return list.iterator();
            }
        };

    }

    private Iterable<String> reverse(){
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    int size = str.length-1;
                    @Override
                    public boolean hasNext() {
                        return size > -1;
                    }

                    @Override
                    public String next() {
                        return str[size--];
                    }

                    @Override
                    public void remove(){
                        throw new UnsupportedOperationException("We do not delete.");
                    }
                };
            }
        };
    }

    @Override
    public Iterator<String> iterator() {
//                List<String> list = new ArrayList<>(Arrays.asList(str));
//                return list.iterator();

        return new Iterator<String>() {
            int size;
            @Override
            public boolean hasNext() {
                return size < str.length;
            }

            @Override
            public String next() {
                return str[size++];
            }

            @Override
            public void remove(){
                throw new UnsupportedOperationException("We do not delete.");
            }
        };
    }
}

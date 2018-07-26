package dima;

import java.util.*;

class Generator{
    private static List<String> arr = new ArrayList<>(Arrays.asList("fgvg", "kmhu", "vrtdgcv", "ihk", "qwer", "mnb", "[poi"));
    private static int x;
    private static String next(){
        String str = arr.get(x++);
        x %= arr.size();
        return str;
    }

    private static Collection<String> fill(Collection<String> col){
        for (int i = 0; i < arr.size(); i++) {
            col.add(next());
        }
        return col;
    }

    private static String[] fill(String[] arr){
        for (int i = 0; i < Generator.arr.size(); i++) {
            arr[i] = next();
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Array = "+Arrays.toString(fill(new String[arr.size()])));
        System.out.println("ArrayList = "+fill(new ArrayList<>()));
    }
}
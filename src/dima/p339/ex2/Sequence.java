package dima.p339.ex2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Sequence {
    private Object[] items;
    private int next;

    protected Sequence(int size) {
        items = new Object[size];
    }

    private void add(Object x){
        if(next<items.length){
            items[next++] = x;
        }
    }

    private class Another{
        private String s;

        Another(String s){
            this.s = s;
        }

        @Override
        public String toString() {
            return "Another{" +
                    "s='" + s + '\'' +
                    '}';
        }
    }

    private class SequenceIterator implements Iterator<Object> {
        private int i;

        @Override
        public boolean hasNext() {
            return i<items.length;
        }

        @Override
        public Object next() {
            return hasNext() ? items[i++] : new NoSuchElementException();
        }
    }

    private Iterator<Object> iterator(){ return new SequenceIterator(); }

    private Another getAnother(int i){
        return new Another(Integer.toString(i));
    }

    public static void main(String[] args) {

        Sequence s = new Sequence(10);
        for (int i = 0; i < s.items.length; i++) {
            s.add(s.getAnother(i));
        }

        for(Iterator<Object> it = s.iterator(); it.hasNext();){
            System.out.println(it.next());
        }

        Iterator<Object> it = s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

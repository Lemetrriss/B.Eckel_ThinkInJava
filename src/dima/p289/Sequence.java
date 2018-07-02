package dima.p289;

interface Selector{
    boolean end();
    Object current();
    void next();
}

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
            System.out.println(Sequence.this.next);
        }

        @Override
        public String toString() {
            return "Another{" +
                    "s='" + s + '\'' +
                    '}';
        }
    }

    private class SequenceSelector implements Selector{
        private int i;
        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) i++;
        }

        private Sequence getThis(){ return Sequence.this; }
    }

    private Selector getSelector(){ return new SequenceSelector(); }

    private Another getAnother(int i){
        return new Another(Integer.toString(i));
    }

    public static void main(String[] args) {
        Sequence s = new Sequence(10);
        for (int i = 0; i < s.items.length; i++) {
            s.add(Integer.toString(i));
        }
        Sequence s2 = new Sequence(5);
        for (int i = 0; i < s2.items.length; i++) {
            s2.add(s2.getAnother(i));
        }

        Selector selector = s.getSelector();
        while(!selector.end()){
            System.out.print(selector.current()+" ");
            selector.next();
        }

        System.out.println();

        Selector selector1 = s2.getSelector();
        while (!selector1.end()){
            System.out.println(selector1.current());
            selector1.next();
        }
    }
}

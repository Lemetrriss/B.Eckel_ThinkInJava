package dima.p292;

public class Sequence {
    private Object[] items;
    private int count;

    private void add(Object obj){
        items[count++]=obj;
    }

    private Sequence(int i) {
        items = new Object[i];
    }

    private SequenceSelector getSequence(){
        return new SequenceSelector();
    }

    private class SequenceSelector implements Selector{
        private int i=0;

        @Override
        public boolean end() { return i==items.length; }
        @Override
        public void next() {if(i<items.length) i++; }
        @Override
        public Object current() {
            return items[i];
        }

        public Sequence getOuter(){
            return Sequence.this;
        }
    }

    private class New{
        private String st = "hello";

        @Override
        public String toString() {
            return "New{" +
                    "st='" + st + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Sequence sq = new Sequence(10);
        Selector sel = sq.getSequence();
        for (int i=0; i<sq.items.length; i++)
            sq.add(Integer.toString(i));
        while (!sel.end()){
            System.out.print(sel.current()+" ");
            sel.next();
        }
        Sequence.New n = ((SequenceSelector) sel).getOuter().new New();
        System.out.println(n);
    }
}

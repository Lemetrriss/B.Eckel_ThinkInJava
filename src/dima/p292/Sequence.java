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

    private Selector getSequence(){
        return new SequenceSelector();
    }
    private Selector getReverse(){return new ReverseSelector();}

    private class ReverseSelector implements Selector{
        @Override
        public boolean end() {
            return false;
        }

        @Override
        public void next() {

        }

        @Override
        public Object current() {
            return null;
        }
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

    public static void main(String[] args) {
        Sequence sq = new Sequence(10);
        Selector sel = sq.getSequence();
        Selector rev = sq.getReverse();
        for (int i=0; i<sq.items.length; i++)
            sq.add(Integer.toString(i));
        while (!sel.end()){
            System.out.print(sel.current()+" ");
            sel.next();
        }
    }
}

package dima.p290;

import javax.swing.plaf.PanelUI;

public class Outer {
    private String s;

    class Inner{
        int i;
        Inner(int i){
            this.i = i;
        }

        @Override
        public String toString() {
            return s;
        }
    }

    private Inner getInner(int i){
        return new Inner(i);
    }

    Outer(String s){
        this.s = s;
    }

    public static void main(String[] args) {
        Outer o = new Outer("Ukrraine");
        Outer.Inner oi1 = o.getInner(11);
        Outer.Inner oi = new Outer("Canada").new Inner(13);
        System.out.println(oi);
    }
}

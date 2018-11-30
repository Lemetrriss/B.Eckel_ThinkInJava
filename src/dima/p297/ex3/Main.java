package dima.p297.ex3;
import dima.p297.ex2.*;

class HiddenInner {
    private class PDest implements Dest{
        PDest() {
            System.out.println("in constructor");
        }

        @Override
        public String getStr() {
            return "Fuck";
        }
    }
        Dest getDest(){
        return new PDest();
    }
}

public class Main{
    public static void main(String[] args) {
        HiddenInner hi = new HiddenInner();
        Dest dest = hi.getDest();
//        PDest pdest = (PDest) hi.getDest();
        System.out.println(dest.getClass().getSimpleName());
//        System.out.println(pdest.getClass().getSimpleName());
    }
}
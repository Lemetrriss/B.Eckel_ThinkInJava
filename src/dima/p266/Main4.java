package dima.p266;

abstract class Main4 { }

class SubMain extends Main4{
    private void ourMethod(Main4 m){
        System.out.println(m);
    }

    public static void main(String[] args) {
        Main4 m = new SubMain();
        ((SubMain)m).ourMethod(m);
    }
}
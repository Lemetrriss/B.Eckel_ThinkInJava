package dima.p266;

abstract class Main3 {
    Main3() {
        print();
    }
    abstract void print();
}

class SubMain3 extends Main3{
    private int i = 56;
    void print(){
        System.out.println(i);
    }

    public static void main(String[] args) {
        Main3 sm = new SubMain3();
        sm.print();
    }
}


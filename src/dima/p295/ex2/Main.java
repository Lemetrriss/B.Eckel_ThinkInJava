package dima.p295.ex2;

public class Main {
    private int i=0;
    private void print(){
        System.out.println(i);
    }

    class Inner{

        private String str = "private Inner var";
        private void printInner(){
            i = 10;
            print();
        }
    }

    private Inner test(){
        Inner in = new Inner();
        in.printInner();
        return in;
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.print();
        System.out.println(m.test().str);
    }
}

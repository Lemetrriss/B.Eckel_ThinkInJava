package dima.p301.ex1;

public class Main {
    private int i=0;
    private void print(){
        System.out.println(i);
    }

    public Inner inner(){
        return new Inner (){
            public void printInner(){
                i = 10;
                print();
                System.out.println(getClass().getSimpleName());
            }
        };
    }

    private Inner test(){
        Inner in =inner();
        in.printInner();
        return in;
    }

    abstract class Inner{
        private String str = "private Inner var";
        abstract void printInner();
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.print();
        System.out.println(m.test().str);
    }
}

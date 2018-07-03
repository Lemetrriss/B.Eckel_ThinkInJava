package dima.p306.ex2;

public interface Iface {
    String s = "ggaatt";
    static String get(){
        return s;
    }
    class Inner{
        static void print(){
            System.out.println(get());
        }

        public static void main(String[] args) {
            print();
        }
    }
}

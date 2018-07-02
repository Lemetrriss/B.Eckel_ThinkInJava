package dima.p298;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().wrapping(10).getClass().getSimpleName());
        Wrapping w = new Main().wrapping(13);
    }
    public Wrapping wrapping(int x){
        return new Wrapping(x){
            public int value(){
                return super.value()*47;
            }
        };
    }
    abstract class Wrapping{
        private int i;

        public Wrapping(int x){
            i=x;
        }
        public int value(){
            return i;
        }
    }
}

package dima.p235;

public class Insect {
    private int i;
    int j;
    static {
        System.out.println("Load class Insect");
    }
    Insect(final int i){
        this.i = i;
        System.out.println("i = "+i+"; "+"j = "+j);
        j = 39;
    }
    private static int x = printInt("Field static Insect.x initialized");
    static int printInt(String s){
        System.out.println(s);
        return 111;
    }
}
class Beetle extends Insect{
    private final int k = printInt("Field static Beetle.k initialized");
    private int x;
    static {
        System.out.println("Load class Beetle");
    }
    Beetle(int i){
        super(10);
        x = i;
        System.out.println("Constructor Beetle");
        System.out.println("k = "+k);
        System.out.println("x = "+x);
        System.out.println("j = "+j);
    }

    public static void main(String[] args) {
        System.out.println("Conctructor Beetle");
        Insect in = new Beetle(515);
    }

}
class Fly extends Beetle{
    Fly(int j){
        super(15);
        this.j = j;
        System.out.println("Fly.j = "+j);
        System.out.println("f = "+f);
    }
    private static int f = printInt("Field static Fly.f initialized");
    public static void main(String[] args) {
        System.out.println("Conctructor Fly");
        new Fly(99);
    }
}
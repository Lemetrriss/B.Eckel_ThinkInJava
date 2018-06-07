package dima.p228;
import java.util.Random;

public class Finalword {
    private static Random r = new Random();
    private final int i1 = r.nextInt(1000);
    private static final int i2 = r.nextInt(1000);

    public static void main(String[] args) {
        Finalword[] a = new Finalword[10];
        for(int i=0; i<a.length; i++)
            a[i] = new Finalword();
        for(Finalword f:a)
            System.out.println(f);
    }

    @Override
    public String toString() {
        return "i1 = "+i1+", i2 = "+i2;
    }

}

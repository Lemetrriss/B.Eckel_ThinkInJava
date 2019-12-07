package dima.p429;

import java.util.Formatter;

public class FormatToString {
    private static String s = "-";
    private static String[] str = {"9","7","8","4","11","5","14"};

    private int anInt;
    private long l;
    private float f;
    private double d;

    public FormatToString(int anInt, long l, float f, double d) {
        this.anInt = anInt;
        this.l = l;
        this.f = f;
        this.d = d;
    }

    public static void main(String[] args) {
        System.out.println(new FormatToString(10, 1202, 456.33f, 53423.245644));

        Formatter f = new Formatter(System.err);
//        System.out.format("This %s is about %n%S %c", "book", "java", '8');
        f.format("Hello %"+s+""+str[6]+".5s and welcome in %.3f", "Dmytro", 2020.54);
        System.out.print(String.format("%nThis is %d exemple of %S.%s%n", 1, "STRING", "format"));
    }

    @Override
    public String toString() {
        return String.format("FormatToString{i=%d, l=%d, f=%f, d=%f}", anInt,l,f,d);
    }
}

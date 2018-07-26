package dima.p310;

public class Cally1 implements Incrementable{
    private int i;
    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}

package dima.p254.ex_13_1;

public class Composing {
    private Shared shared;
    private static long count;
    private final long id = count++;
    public Composing(Shared shared){
        this.shared = shared;
        this.shared.addRef();
        System.out.println("Creating " + this);
    }

    public void dispose(){
        System.out.println("Disposing " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing " + id;
    }
}

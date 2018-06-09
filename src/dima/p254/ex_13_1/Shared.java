package dima.p254.ex_13_1;

public class Shared {
    private int refcount;
    private static long counter;
    private final long id = counter++;

    public Shared() {
        System.out.println("Creating Shared" + id);
    }
    public void addRef(){
        refcount++;
    }
    public void dispose(){
        refcount--;
        if(refcount == 0){
            System.out.println("Disposing " + this);
        }
    }

    @Override
    protected void finalize() throws Throwable {
        if(refcount!=0)
            System.out.println("Finalize Error!");
        super.finalize();
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }
}

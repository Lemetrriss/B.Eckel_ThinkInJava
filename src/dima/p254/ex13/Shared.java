package dima.p254.ex13;

class Shared {
    private int refCount = 0;
    private static int count = 0;
    private final int id = count++;
    Shared(){
        System.out.println("Creating Shared " + id);
    }
    public void addRef(){
        refCount++;
    }
    public void dispose(){
        if(--refCount==0)
            System.out.println("Disposing Shared " + id);
    }
}
class Composing{
    private Shared shared;
    private static int count = 0;
    private final int id = count++;
    Composing(Shared shared){
        this.shared = shared;
        this.shared.addRef();
        System.out.println("Composing " + id);
    }
    void dispose(){
        System.out.println("Disposing " + id);
        shared.dispose();
    }
}
class RefCount{
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] comp = new Composing[]{
                new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared)};
        for(Composing c : comp)
            c.dispose();
    }
}
package dima.p213;

public class Root {
    protected Root(String r){
        System.out.println("Root "+r);
        c1 = new Comp1("1");
        c2 = new Comp2("2");
        c3 = new Comp3("3");
    }
    void dispose(){
        System.out.println("Close Sroot");
        c3.dispose();
        c2.dispose();
        c1.dispose();
    }
    public Comp1 c1;
    public Comp2 c2;
    public Comp3 c3;
}

class Stem extends Root {
    public Comp1 c4;
    public Comp2 c5;
    public Comp3 c6;
    Stem(String st){
        super("Sroot");
        System.out.println("Stem "+st);
        c4 = new Comp1("4");
        c5 = new Comp2("5");
        c6 = new Comp3("6");
    }
    @Override
    void dispose(){
        System.out.println("Close huem");
        c6.dispose();
        c5.dispose();
        c4.dispose();
        super.dispose();
    }
    public static void main(String[] args) {
        new Stem("Huem").dispose();
    }
}

class Comp1 {
    private String st;
    Comp1(String s1){
        st=s1;
        System.out.println("Comp "+s1);
    }
    void dispose(){
        System.out.println("Close Comp "+st);
    }
}

class Comp2 {
    private String st;
    Comp2(String s2){
        st=s2;
        System.out.println("Comp "+s2);
    }
    void dispose(){
        System.out.println("Close Comp "+st);
    }
}

class Comp3 {
    private String st;
    Comp3(String s3){
        st=s3;
        System.out.println("Comp "+s3);
    }
    void dispose(){
        System.out.println("Close Comp "+st);
    }
}
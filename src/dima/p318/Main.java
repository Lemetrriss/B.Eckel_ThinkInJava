package dima.p318;

class Main {
    class Inner{
        Inner(int i){
            System.out.println(i++);
        }
    }
}

class Outer {
    class InheritInner extends Main.Inner {
        InheritInner (Main m){
            m.super(5);
        }
    }
}

class Doing{
    public static void main(String[] args) {
        Outer.InheritInner oii = new Outer().new InheritInner(new Main());
    }
}
package dima.p212;

class A {
    A(String s){
        System.out.println(s);
    }
}
class B {
    B(String st){
        System.out.println("class B");
    }
}
class C extends A {
    B b;
    C(){
        super("class A");
        b = new B("class B");
    }
    public static void main(String[] args) {
        new C();
    }
}
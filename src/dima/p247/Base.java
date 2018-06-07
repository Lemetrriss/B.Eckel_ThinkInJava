package dima.p247;

public class Base {
    void first() {
        System.out.println("Base.First method");
        second();
    }
    void second() {
        System.out.println("Base.Second method");
    }
}

class Child extends Base {
    void second(){
        System.out.println("Child.Second method");
    }
}

class Main2 {
    public static void main(String[] args) {
        Base base = new Child();
        base.first();
    }
}
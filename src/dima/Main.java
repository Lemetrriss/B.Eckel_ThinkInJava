package dima;

class Main {
    private void f(){
        System.out.println("Private");
    }

    public static void main(String[] args) {
        Main mn = new Dima();
        mn.f();
    }
}

class Dima extends Main{
    public void f(){
        System.out.println("Public");
    }

    public static void main(String[] args) {
        Main m = new Dima();
//        m.f();
    }
}

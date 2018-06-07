package dima;

class Main {
    int x = 1;
    protected int f(){
        System.out.println("Main");
        return x;
    }
}

class Dima extends Main{
    int x = 2;
    public int f(){
        System.out.println("Dima");
        return x;
    }

    public static void main(String[] args) {
        Main m = new Dima();
        System.out.println(m.f());
        System.out.println(m.x);
    }
}

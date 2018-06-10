package dima;

class Main {
    int x = 1;
    int f(){
        System.out.println("Main");
        return x;
    }
}

class Dima extends Main{
    int x = 2;
    int f(){
        System.out.println("Dima");
        return x;
    }

    public static void main(String[] args) {
        Main m = new Dima();
        Dima d = new Dima();
        System.out.println(m.f());
        System.out.println(m.x);
        System.out.println(m.getClass().getName()+'@'+Integer.toHexString(m.hashCode()));
        System.out.println(m.getClass()+"@"+m.hashCode());
        System.out.println(m.equals(d));
        System.out.println(m==d);
    }
}

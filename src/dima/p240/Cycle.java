package dima.p240;

class Cycle {
    private String s;
    Cycle(String s) {
        this.s = s;
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "class "+s;
    }

    int wheels(int wheels) {
        return wheels;
    }
}

class Unicycle extends Cycle {
//    private int wheels = 1;
    Unicycle(String s){
        super("Cycle");
        System.out.println("Inside "+s+" Constructor");
    }
    int wheels(int wheels) {
        return wheels;
    }
}

class Bicycle extends Cycle{
//    private final int wheels = 2;
    Bicycle(String s){
        super("Cycle");
        System.out.println("Inside "+s+" Constructor");
    }
    int wheels(int wheels) {
        return wheels;
    }
}

class Tricycle extends Cycle{
//    private final int wheels = 3;
    Tricycle(String s){
        super("Cycle");
        System.out.println("Inside "+s+" Constructor");
    }
    int wheels(int wheels) {
        return wheels;
    }
}

class PolyMain{

    private static void ride(int i, Cycle c){
        System.out.println("count of wheels is "+c.wheels(i));
    }

    public static void main(String[] args) {
        Cycle c3 = new Tricycle("Tricycle");
        ride(3, c3);
        ride(2, new Bicycle("Bicycle"));
        ride(1, new Unicycle("Unicycle"));
    }
}
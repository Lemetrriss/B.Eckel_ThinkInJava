package dima.p240;

class Cycle {
    String s;
    Cycle(String s) {
        this.s = s;
    }
    @Override
    public String toString() {
        return "class "+s;
    }

    int wheels() {
        return 0;
    }
}

class Unicycle extends Cycle {
    int wheels = 1;
    Unicycle(){
        super("Unicycle");
        System.out.println("Inside Unicycle Constructor");
    }
    int wheels() {
        return wheels;
    }
}

class Bicycle extends Cycle{
    final int wheels = 2;
    Bicycle(){
        super("Bicycle");
        System.out.println("Inside Bicycle Constructor");
    }
    int wheels() {
        return wheels;
    }
}

class Tricycle extends Cycle{
    final int wheels = 3;
    Tricycle(){
        super("Tricycle");
        System.out.println("Inside Tricycle Constructor");
    }
    int wheels() {
        return wheels;
    }
}

class PolyMain{

    static void ride(Cycle c){
        System.out.println(c.wheels());
    }
    public static void main(String[] args) {
        ride(new Tricycle());
        ride(new Bicycle());
        ride(new Unicycle());
    }
}
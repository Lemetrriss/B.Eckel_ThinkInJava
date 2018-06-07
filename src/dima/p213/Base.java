package dima.p213;

class Base {
    Base(String s){
        System.out.println("Construct Class "+s);
    }
}

class Under extends Base {
    Under(String s){
        super(s);
        System.out.println("Under Construct");
    }
    Under(){
        this("Base");
        System.out.println("Default Under Construct");
    }

    public static void main(String[] args) {
        new Under();
    }
}
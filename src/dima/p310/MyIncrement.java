package dima.p310;

class MyIncrement {
    public void increment(){
        System.out.println("Enother operation");
    }

    static void f(MyIncrement mi){
        mi.increment();
    }
}

package dima.p222;
import dima.p213.Root;
class Engine{
    void start(){}
    void rev(){}
    void stop(){}
    void service(){
        System.out.println("Need to repare");
    }
}
class Wheel{
    void inflate(int psi){}
}
class Window{
    void rollup(){}
    void rolldown(){}
}
class Door{
    Window window = new Window();
    void open(){}
    void close(){}
}

public class Car extends Root{
    private Engine engine = new Engine();
    private Wheel[] wheel = new Wheel[4];
    private Door
            left = new Door(),
            right = new Door();
    Car(){
        super("Hooper");
        for(int i=0; i<wheel.length; i++){
            wheel[i]=new Wheel();
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.engine.service();
        car.right.window.rolldown();
        car.wheel[1].inflate(4);
    }
}
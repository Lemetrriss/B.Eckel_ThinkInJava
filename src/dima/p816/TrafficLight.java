package dima.p816;

import java.util.Random;

public enum TrafficLight {
    RED("This is red colour"),
    GREEN("This is green colour"),
    YELLOW("This is yellow colour");

    static Random r = new Random();
    String s;
    TrafficLight(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }
    public static TrafficLight next(){
        return values()[r.nextInt(values().length)];
    }

    @Override
    public String toString() {
        return "TrafficLight is " + name();
    }
}

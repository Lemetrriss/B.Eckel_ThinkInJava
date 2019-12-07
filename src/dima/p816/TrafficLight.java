package dima.p816;

public enum TrafficLight {
    RED, GREEN, YELLOW;

    @Override
    public String toString() {
        return "TrafficLight is " + name();
    }
}

package dima.p207;

public class WaterSource {
    private String s;

    public WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}
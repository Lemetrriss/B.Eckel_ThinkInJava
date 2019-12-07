package dima.p207;

public class SprinklerSystem {
    String value1, value2, value3, value4;
    WaterSource source = new WaterSource();
    private int i;
    private float f;

    @Override
    public String toString() {
        return  "value1='" + value1 +
                ", value2='" + value2 +
                ", value3='" + value3 +
                ", value4='" + value4 + '\n' +
                ", i=" + i + ", f=" + f + '\n' +
                ", source=" + source ;
    }

    public static void main(String[] args) {
        SprinklerSystem system = new SprinklerSystem();
        System.out.println(system);
    }
}

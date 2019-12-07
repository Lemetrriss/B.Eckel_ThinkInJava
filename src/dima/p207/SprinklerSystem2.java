package dima.p207;

public class SprinklerSystem2 {
    String value1, value2, value3, value4;
    WaterSource source = new WaterSource();
    private int i;
    private float f;

    @Override
    public String toString() {
        StringBuilder st = new StringBuilder();
        st.append("value1='").append(value1).append(", value2='").append(value2).append(", value3='").append(value3).append(", value4='").append(value4).append(", i=").append(i).append(", f=").append(f).append(", source=").append(source);
        return  st.toString();
    }

    public static void main(String[] args) {
        SprinklerSystem2 system = new SprinklerSystem2();
        System.out.println(system);
    }
}

package dima.p816;

//import static dima.p816.TrafficLight.*;

public class TrafficLightStatic {
    private TrafficLight light;

    private TrafficLightStatic(TrafficLight light) {
        this.light = light;
    }

    private void change(){
        switch (light) {
            case RED -> light = TrafficLight.GREEN;

            case GREEN -> light = TrafficLight.YELLOW;

            case YELLOW -> light = TrafficLight.RED;
        }
    }

    public static void main(String[] args) {
        TrafficLightStatic tfs = new TrafficLightStatic(TrafficLight.RED);
        for (int i=0; i<7; i++){
            System.out.println(TrafficLight.values()[2].name());
            System.out.println(tfs.light + " : " + tfs.light.getS());
            tfs.change();
        }
        System.out.println("----------------------------------");
        for (int j=0; j<5; j++)
            System.out.println(TrafficLight.next());
    }
}

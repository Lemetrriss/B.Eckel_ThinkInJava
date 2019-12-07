package dima.p816;

import static dima.p816.TrafficLight.*;

public class TrafficLightStatic {
    private TrafficLight light;

    private TrafficLightStatic(TrafficLight light) {
        this.light = light;
    }

    private void change(){
        switch (light) {
            case RED -> light = GREEN;

            case GREEN -> light = YELLOW;

            case YELLOW -> light = RED;
        }
    }

    public static void main(String[] args) {
        TrafficLightStatic tfs = new TrafficLightStatic(RED);
        for (int i=0; i<7; i++){
            System.out.println(tfs.light);
            tfs.change();
        }
    }
}

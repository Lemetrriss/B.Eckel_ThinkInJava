package dima.p312;

import dima.p312.controller.Event;

public class GreenHouseControl {
    public static void main(String[] args) {
        GreenHouseContoller gc = new GreenHouseContoller();
        gc.addEvent(gc.new LightOn(1000));
        gc.addEvent(gc.new LightOff(1000));
        gc.addEvent(gc.new Bell(1000));
        gc.addEvent(gc.new Terminate(1000000));
        gc.run();
    }
}

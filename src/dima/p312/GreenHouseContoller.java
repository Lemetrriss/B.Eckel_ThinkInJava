package dima.p312;

import dima.p312.controller.Controller;
import dima.p312.controller.Event;

public class GreenHouseContoller extends Controller{

    boolean lightOn = false;
    public class LightOn extends Event{
        public LightOn(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            lightOn = true;
        }

        @Override
        public String toString() {
            return "Light ON";
        }
    }

    public class LightOff extends Event{
        public LightOff(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            lightOn = false;
        }

        @Override
        public String toString() {
            return "Light OFF";
        }
    }

    public class Bell extends Event{
        public Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new Bell(5000));
        }

        @Override
        public String toString() {
            return "Bell";
        }
    }

    public class Terminate extends Event{
        public Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);
        }

        @Override
        public String toString() {
            return "Terminate{}";
        }
    }
}

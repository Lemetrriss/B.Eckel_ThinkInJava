package dima.p312.controller;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public List<Event> eventList = new ArrayList<>();

    public void addEvent(Event e){
        eventList.add(e);
    }

    public void run(){
        while (eventList.size() > 0){
            for(Event event : new ArrayList<>(eventList)){
                if(event.ready()){
                    System.out.println(event);
                    event.action();
                    eventList.remove(event);
                }
            }
        }
    }
}

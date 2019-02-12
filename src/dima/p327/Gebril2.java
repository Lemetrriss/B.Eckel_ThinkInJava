package dima.p327;

import java.util.ArrayList;
import java.util.List;

public class Gebril2 {
    int gebrilNumber;

    public Gebril2(int gebrilNumber) {
        this.gebrilNumber = gebrilNumber;
    }

    void hop() {
        System.out.println("Number of Gebril: " + gebrilNumber);
    }

}

class Main{

    List<Gebril2> list = new ArrayList<>();

    void addList(Gebril2 g){
        list.add(g);
    }

    public static void main(String[] args) {
        Main main = new Main();
        for (int i=0; i<13; i++){
            main.addList(new Gebril2(i));
        }

        for(int i=0; i<main.list.size(); i++){
            main.list.get(i).hop();
        }

        for (Gebril2 g : main.list){
            g.hop();
        }
    }
}
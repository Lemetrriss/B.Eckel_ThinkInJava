package dima.p325;

import java.util.ArrayList;
import java.util.List;

class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List apples = new ArrayList();
        for (int i = 0; i<3; i++){
            apples.add(new Apple());
        }
        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            ((Apple)apples.get(i)).getId();
        }
    }
}
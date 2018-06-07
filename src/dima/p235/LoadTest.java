package dima.p235;

public class LoadTest {
    int x = 10;
    static {
        System.out.println("Loading test");
    }
    static void loadTest(){

    }
}

class MainTest extends LoadTest{
    public static void main(String[] args) {
        System.out.println("Start");
    //    LoadTest.loadTest();
        System.out.println("Making obj");
        new LoadTest();
    }
}

package dima.p325;

public class Apple {
    private static long count;
    private final long id = count++;

    public long getId(){
        return id;
    }
}

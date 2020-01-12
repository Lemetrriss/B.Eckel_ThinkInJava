package dima.p900.ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class CallableDem implements Callable<List<Long>> {
    private int size;
    private List<Long> list = new ArrayList<>();

    CallableDem(int size) {
        this.size = size-2;
    }

    @Override
    public List<Long> call() {
        list.add(0L);
        list.add(1L);
        count(0,1,size);
        System.out.println(list);
        return list;
    }

    private void count(long a, long b, int size){
        list.add(a+b);
        if(--size>0)
            count(b, a+b, size);
    }

//    public static void main(String[] args) {
//        List<Long> call = new CallableDem(10).call();
//        System.out.println(call);
//    }
}

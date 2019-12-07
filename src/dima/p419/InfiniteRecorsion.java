package dima.p419;

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecorsion {
    @Override
    public String toString() {
        return "InfiniteRecorsion " + super.toString() + '\n';
    }

    public static void main(String[] args) {
        List<InfiniteRecorsion> list = new ArrayList<>();
        for (int i=0; i<10; i++)
            list.add(new InfiniteRecorsion());
        System.out.println(list);
        var chars = "kjfsb".toCharArray();
        System.out.println(chars);
    }
}

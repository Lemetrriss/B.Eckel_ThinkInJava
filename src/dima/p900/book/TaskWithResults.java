package dima.p900.book;

import java.util.concurrent.Callable;

public class TaskWithResults implements Callable<String> {
    private final int id;

    TaskWithResults(int id) {
        this.id = id;
    }

    @Override
    public String call() {
        return "Task #" + id;
    }
}

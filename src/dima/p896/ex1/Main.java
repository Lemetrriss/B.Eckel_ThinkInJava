package dima.p896.ex1;

public class Main {
    public static void main(String[] args) {
        new Thread(new Process(1)).start();
        System.out.println("after first Thread");
        new Thread(new Process(2)).start();
        System.out.println("after second Thread");
        new Thread(new Process(3)).start();
        System.out.println("after third thread");
    }
}

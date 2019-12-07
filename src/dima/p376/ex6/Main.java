package dima.p376.ex6;
class MyException extends Throwable {
    public MyException() {
        System.out.println(getMessage());
        printStackTrace();
    }
}

public class Main {
    public static void main(String[] args)  {
        try {
            throw new MyException();
        } catch (MyException e) {
//            e.printStackTrace();
        }
        System.out.println("Hallo");
    }
}

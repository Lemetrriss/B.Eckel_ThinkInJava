package dima.p385.ex10;

class NewException extends Exception{
    public NewException() {
    }
}

class NewExc extends Exception{
    public NewExc() {
    }
}

public class Main {
    private void f() {
        try {
            try {
                g();
            } catch (NewException e) {
                e.printStackTrace();
                throw new NewExc();
            }
        } catch (NewExc exc){
            exc.printStackTrace();
        }
    }

    private void g() throws NewException {
        throw new NewException();
    }

    public static void main(String[] args) {
        new Main().f();
    }
}

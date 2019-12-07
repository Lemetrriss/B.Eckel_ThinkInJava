package dima.p385.ex11;

class NewException extends Exception{
    public NewException() {
    }
}

class NewExc extends Exception{
    public NewExc() {
    }
}

public class Main {
    private void f() throws NewException {
            try {
                g();
            } catch (NewException e) {
                e.printStackTrace();
                System.out.println();
//                e.initCause(new RuntimeException());
                e.initCause(new RuntimeException());
                throw e;
            }
    }

    private void g() throws NewException {
        throw new NewException();
    }

    public static void main(String[] args) {
        try{
            new Main().f();
        } catch (NewException ex){
            try{
                throw ex.getCause();
            } catch (Exception e){
                System.out.println(e);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }
}

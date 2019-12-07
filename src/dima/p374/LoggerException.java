package dima.p374;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class MyException extends Exception{
    private static Logger logger = Logger.getLogger("Мой эксэпшн");
    MyException(String msg) {
        super(msg);
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printStackTrace(printWriter);
        logger.severe(stringWriter.toString());
//        logger.severe("Сообщение из СЕВЕРЕ");
    }

    @Override
    public String getMessage() {
        return "there is my messege: " + super.getMessage();
    }
}

public class LoggerException{
    private static Logger logger = Logger.getLogger("My Logger");
    public static void main(String[] args) {
        try{
            throw new NullPointerException();
        } catch (NullPointerException e){
            loggerMethod(e);
            System.out.println(e.getMessage());
        }
        LoggerException le = new LoggerException();
        try {
            le.g();
        } catch (MyException e) {
//            System.out.println(e.getMessage());
        }
//        le.f();
    }

    private void f() {
        throw new NullPointerException();
    }

    private void g() throws MyException {
        throw new MyException("Call from g()");
    }

    private static void loggerMethod(Exception e) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        e.printStackTrace(writer);
        logger.severe(stringWriter.toString());
    }
}
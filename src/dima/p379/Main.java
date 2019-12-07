package dima.p379;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class MyEx extends Exception{
    private static Logger log = Logger.getLogger(MyEx.class.getName());
    public MyEx() {
//        System.out.println("My own exception");
        StringWriter stringWriter = new StringWriter();
        PrintWriter pw = new PrintWriter(stringWriter);
        printStackTrace(pw);
        log.severe(stringWriter.toString());
    }
}

public class Main {
    private void a(){
        try{
            throw new MyEx();
        } catch (Exception e){
//            System.out.println(e.toString());
//            e.printStackTrace();
            for (StackTraceElement element : e.getStackTrace()) {

                System.out.println(
//                        "1) " + element.getClassLoaderName() + "\n"
                        "2) " + element.getClassName() + "\n"
                                + "5) " + element.getMethodName() + "\n"
                                + "4) " + element.getFileName() + "\n"
                                + "3) " + element.getLineNumber() + "\n"
//                        + "6) " + element.getModuleName() + "\n"
//                        + "7) " + element.getModuleVersion() + "\n"
                );
            }
        }
    }

    private void b(){
        a();
    }

    void c(){
        b();
    }

    public static void main(String[] args) {
        new Main().c();
    }
}

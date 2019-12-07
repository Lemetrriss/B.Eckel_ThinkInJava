package dima.p295.number2.main;

import dima.p295.number2.class1.Class1;
import dima.p295.number2.interf.Inter;

import java.io.*;

public class Main extends Class1 {

//    public Inter getC2(){
//        return new InnerClass();
//    }
    public static void main(String[] args) {
        Class1.InnerClass cic = new Main().new InnerClass();
        cic.f();

//        Inter in = new Main().getC2();
//        in.f();
    }
}

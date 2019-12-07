package dima.p295.number2.class1;

import dima.p295.number2.interf.Inter;

public class Class1 {
    protected class InnerClass implements Inter{

        private String str = "Hallo";

        public InnerClass() {
        }
        private void g(){
            System.out.println("private g()");
        }
        @Override
        public void f() {
            System.out.println("Hello");
        }
    }

//    private InnerClass getInner(){
//        return new InnerClass();
//    }

    public static void main(String[] args) {
//        Class1.InnerClass inc = new Class1().getInner();
//        inc.g();
//        System.out.println(inc.str);
    }
}

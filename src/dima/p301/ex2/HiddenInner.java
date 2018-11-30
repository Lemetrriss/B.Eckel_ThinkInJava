//package dima.p301.ex2;
//import dima.p297.ex2.Dest;
//
// class Main {
//    private class PDest implements Dest{
//        PDest() {
//            System.out.println("in constructor");
//        }
//
//        @Override
//        public String getStr() {
//            return "private inner class";
//        }
//    }
//
//    Dest getDest(){
//        return new PDest(){
//
//            @Override
//            public String getStr() {
//                return "Fuck";
//            }
//        };
//    }
//}
//
//public class HiddenInner{
//    public static void main(String[] args) {
//        Main main = new Main();
//        Dest dest = main.getDest();
////        PDest pdest = (PDest) hi.getDest();
//        System.out.println(dest.getStr());
////        System.out.println(pdest.getClass().getSimpleName());
//    }
//}

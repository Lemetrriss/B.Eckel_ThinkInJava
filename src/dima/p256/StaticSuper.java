package dima.p256;

public class StaticSuper {
    public static String staticGet(){
        return "Super.staticGet";
    }
    public String dinamicGet(){
        return "Super.dinamicGet";
    }
}
class StaticSub extends StaticSuper{
    public static String staticGet(){
        return "Sub.staticGet";
    }
    @Override
    public String dinamicGet(){
        return "Sub.dinamic.Get";
    }
}
class StaticPoly{
    public static void printClass(StaticSuper ss){
        System.out.println(ss.dinamicGet());
        System.out.println(ss.staticGet());
    }
    public static void main(String[] args) {
        StaticSuper sp = new StaticSub();
//        printClass(sp);
        System.out.println(sp.dinamicGet());
        System.out.println(sp.staticGet());
    }
}
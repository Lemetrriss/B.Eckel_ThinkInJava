package dima.p274;

class Apply {
    public static void process(Processor p, Object o){
        System.out.println(p.name());
        System.out.println(p.process(o));
    }
}

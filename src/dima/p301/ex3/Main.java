package dima.p301.ex3;

public class Main {
    private Other other(String s){
        return new Other(s){
            @Override
            public String getString() {
                String s1 = super.getString() + " in inner anonymous class.";
                System.out.println(s1);
                return s1;
            }
        };
    }

    public static void main(String[] args) {
        new Main().other("Pizdec").getString();
    }
}

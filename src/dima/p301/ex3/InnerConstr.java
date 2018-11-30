package dima.p301.ex3;

public class InnerConstr {
    private String str;

    public InnerConstr(String str) {
        this.str = str;
    }

    public void print() { }
}

class Main2{
    InnerConstr getInner(String str){
        return new InnerConstr(str){
            public void print(){
                System.out.println(str);
            }
        };
    }

    public static void main(String[] args) {
        Main2 main2 = new Main2();
        main2.getInner("Pizdec").print();
    }
}
package dima.p254.ex12;

import java.util.Random;

class Test{
    private String s;
    Test(String s){
        this.s = s;
        System.out.println("Creating Test " + this);
    }
    public String toString(){
        return s;
    }
}

class Modify{
    private int refCount;
    private static long count;
    private final long id = count++;
    Modify(){
        System.out.println("Creating " + this);
    }

    protected void addRef(){
        refCount++;
        System.out.println("Number of references - "+refCount);
    }

    public void dispose(){
        refCount--;
        if(refCount == 0){
            System.out.println("Disposing " + this);
        }
    }

    @Override
    public String toString() {
        return "Modify " + id;
    }
}

class Rodent {
    private static long count;
    private final long id = count++;
    private Modify modify;
    Test test = new Test("Rodent");
    private String s;
    Rodent(String s, Modify modify){
        this.s=s;
        System.out.println("Creating " + this);
        this.modify = modify;
        this.modify.addRef();
    }
    String color() {
        return "common";
    }
    void eat() {
        System.out.println("food");
    }

    protected void dispose(){
        System.out.println("Disposing " + this);
        modify.dispose();
    }

    public String toString() {
        return s + id;
    }

}

class Mouse extends Rodent{
    Test test = new Test("Mouse");
    private String st;
    Mouse(String st, Modify modify) {
        super("constructeur", modify);
        this.st=st;
    }
    String color() {
        return "grey";
    }
    void eat() {
        System.out.println("Mouse like chees");
    }
    public String toString() {
        return st;
    }
}
class Hamster extends Rodent{
    Test test = new Test("Hamster");
    private String ss;
    Hamster(String ss, Modify modify) {
        super("", modify);
        this.ss=ss;
    }
    String color() {
        return "peech";
    }
    void eat() {
        System.out.println("Hamster like cookies");
    }
    public String toString() {
        return ss;
    }

}
class GenerateRandomRod {
    private Random r = new Random();
    public Rodent gen(Modify modify) {
        switch (r.nextInt(3)){
            default:
            case 0: return new Mouse("The Parent class Mouse", modify);
            case 1: return new Rodent("The Base class Rodent", modify);
            case 2: return new Hamster("Parent class Hamster", modify);
        }
    }
}
class Main {
    private static Rodent[] rodents = new Rodent[10];
    private static GenerateRandomRod generadeRandom = new GenerateRandomRod();
    private static void print(Rodent[] r){
        for(Rodent rd : r) {
            System.out.println(rd);
            System.out.println(rd.color());
            rd.eat();
        }
    }
    public static void main(String[] args) {
        Modify modify = new Modify();
        for(int i=0; i<rodents.length; i++)
            rodents[i]=generadeRandom.gen(modify);
        print(rodents);
        for (int i = rodents.length-1; i >= 0; i--) {
            rodents[i].dispose();
        }
    }
}
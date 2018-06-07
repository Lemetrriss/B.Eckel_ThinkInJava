package dima.p254.ex12;

import java.util.Random;

class Test{
    String s;
    Test(String s){
        this.s = s;
        System.out.println("Creating Test " + this);
    }
    public String toString(){
        return s;
    }
}

class Rodent {
    Test test = new Test("Rodent");
    private String s;
    Rodent(String s){
        this.s=s;
    }
    String color() {
        return "common";
    }
    void eat() {
        System.out.println("food");
    }
    public String toString() {
        return s;
    }

}
class Mouse extends Rodent{
    private String st;
    Mouse(String st) {
        super("constructeur");
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
    Hamster(String ss) {
        super("");
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
    public Rodent gen() {
        switch (r.nextInt(4)){
            default:
            case 0: return new Mouse("The Parent class Mouse");
            case 1: return new Rodent("The Base class Rodent");
            case 2: return new Hamster("Parent class Hamster");
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
        new Hamster("");
        //for(int i=0; i<rodents.length; i++)
        //    rodents[i]=generadeRandom.gen();
        //print(rodents);
    }
}
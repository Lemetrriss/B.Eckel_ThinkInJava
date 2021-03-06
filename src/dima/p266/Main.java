package dima.p266;

import java.util.Random;

abstract class Rodent {
    abstract String color();
    abstract void eat();
    public String toString() {
        return "Abstract class Rodent";
    }
}
class Mouse extends Rodent{
    private String st;
    Mouse(String st) {
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
    private String ss;
    Hamster(String ss) {
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
        switch (r.nextInt(3)){
            default:
            case 0: return new Mouse("The Parent class Mouse");
            case 1: return new Hamster("Parent class Hamster");
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
        for(int i=0; i<rodents.length; i++)
            rodents[i]=generadeRandom.gen();
        print(rodents);
    }
}
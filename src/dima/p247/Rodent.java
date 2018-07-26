package dima.p247;

import java.util.*;

class Rodent {
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
    Rodent gen() {
        switch (r.nextInt(4)){
            default:
            case 0: return new Mouse("The Parent class Mouse");
            case 1: return new Rodent("The Base class Rodent");
            case 2: return new Hamster("Parent class Hamster");
        }
    }
}
class Main {
    private static List<Rodent> rodents = new ArrayList<>();
    private static GenerateRandomRod generadeRandom = new GenerateRandomRod();
    private static void print(Collection<Rodent> col){
        for (Rodent r : col) {
            System.out.println(r);
            System.out.println(r.color());
            r.eat();
        }
    }
    public static void main(String[] args) {
        for(int i=0; i<10; i++)
            rodents.add(generadeRandom.gen());
        print(rodents);
    }
}
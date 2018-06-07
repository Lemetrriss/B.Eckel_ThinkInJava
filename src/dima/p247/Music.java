package dima.p247;
import dima.p244.Note;
import java.util.Random;

class Instruments{
    void play(Note n){System.out.println("Instruments.play() + "+n);}
    String what(){return "Instruments";}
    void adjust(){System.out.println("Adjusting Instruments"); }
    public String toString() {
        return what();
    }
}
class Wind extends Instruments {
    void play(Note n){System.out.println("Wind.play() + "+n);}
    String what(){return "Wind";}
    void adjust(){System.out.println("Adjusting Wind"); }

}
class Percussion extends Instruments {
    void play(Note n){System.out.println("Percussion.play() + "+n);}
    String what(){return "Percussion";}
    void adjust(){System.out.println("Adjusting Percussion"); }
}
class Stringed extends Instruments {
    void play(Note n){System.out.println("Stringed.play() + "+n);}
    String what(){return "Stringed";}
    void adjust(){System.out.println("Adjusting Stringed"); }
}
class Woodwind extends Wind {
    void play(Note n){System.out.println("Woodwind.play() + "+n);}
    void adjust(){System.out.println("Adjusting Woodwind"); }
    String what(){return "Woodwind";}
}
class Brass extends Wind {
    void play(Note n){System.out.println("Brass.play() + "+n);}
    String what(){return "Brass";}
}

class GeneradeRandom{
    Random r = new Random();
    public Instruments gen(){
        switch(r.nextInt(6)){
            default:
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new Woodwind();
            case 4: return new Brass();
            case 5: return new Instruments();
        }
    }
}

class Music {
    static GeneradeRandom gr = new GeneradeRandom();
    public static void tuneAll(Instruments[] in) {
        for(Instruments a : in) {
            a.play(Note.MIDDLE_C);
            a.adjust();
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        Instruments[] instruments = new Instruments[20];
        for(int i=0; i<instruments.length; i++)
            instruments[i] = gr.gen();
        tuneAll(instruments);
    }
}
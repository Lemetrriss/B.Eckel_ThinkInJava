package dima.p225;

class Amphibian {
    void jump(){
        System.out.println("jump");
    }
    void walk(){
        System.out.println("walk");
    }
}
class Frog extends Amphibian{
    public static void main(String[] args) {
        Amphibian amphibian = new Amphibian();
        Frog frog = new Frog();
        Amphibian a = frog;
        a.jump();
        amphibian.jump();
    }
    @Override
    void jump(){
        System.out.println("frog jump");
    }
    @Override
    void walk(){
        System.out.println("frog walk");
    }
}
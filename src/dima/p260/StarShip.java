package dima.p260;

class Ship{
    protected void move(){
    }
}

class Ship101 extends Ship{
    private static Ship101 ship101 = new Ship101();
    public void move(){
        System.out.println("Fly slow");
    }

    public static Ship101 getShip101() {
        return ship101;
    }
}

class Ship202 extends Ship{
    private static Ship202 ship202 = new Ship202();
    public void move(){
        System.out.println("Fly fast!");
    }

    public static Ship202 getShip202() {
        return ship202;
    }
}

class Ship303 extends Ship{
    private static Ship303 ship303 = new Ship303();
    public void move(){
        System.out.println("Fly Hypersound speed!");
    }

    public static Ship303 getShip303() {
        return ship303;
    }
}

class StarShip {
    private Ship ship;
    void change(Ship s){
        ship = s;
    }
    void performMove(){
        ship.move();
    }

}

class Main{
    public static void main(String[] args) {
        StarShip starShip = new StarShip();

        starShip.change(Ship101.getShip101());
        starShip.performMove();
        starShip.change(Ship202.getShip202());
        starShip.performMove();
        starShip.change(Ship303.getShip303());
        starShip.performMove();
    }
}

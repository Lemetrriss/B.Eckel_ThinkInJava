package dima.p260;

class Ship{
    protected void move(){
    }
}

class Ship101 extends Ship{
    public void move(){
        System.out.println("Fly slow");
    }
}

class Ship202 extends Ship{
    public void move(){
        System.out.println("Fly fast!");
    }
}

class Ship303 extends Ship{
    public void move(){
        System.out.println("Fly Hypersound speed!");
    }
}

class StarShip {
    Ship ship = new Ship101();

}

class Main{
    public static void main(String[] args) {
        StarShip starShip = new StarShip();
        starShip.ship.move();
    }
}

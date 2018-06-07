package dima.p244;

class Shape {
    public void draw(){}
    public void erase(){}
    public void adjust(){
        System.out.println("Base method adjust");
    }
}

class Square extends Shape {
    @Override
    public void draw(){
        System.out.println("Square.draw()");
    }
    @Override
    public void erase(){
        System.out.println("Square.erase()");
    }
    @Override
    public void adjust(){
        System.out.println("Square.adjust()");
    }
}

class Triangle extends Shape {
    @Override
    public void draw(){
        System.out.println("Triangle.draw()");
    }
    @Override
    public void erase(){
        System.out.println("Triangle.erase()");
    }
}

class Circle extends Shape {
    @Override
    public void draw(){
        System.out.println("Circle.draw()");
    }
    @Override
    public void erase(){
        System.out.println("Circle.erase()");
    }
}

class Octa extends Shape {
    @Override
    public void draw() {
        System.out.println("Octa.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Octa.erase()");
    }
}

    class RandomShapeGenerator {
        private static java.util.Random r = new java.util.Random(46);

        public static Shape gen() {
            switch (r.nextInt(4)) {
                default:
                case 0:
                    return new Circle();
                case 1:
                    return new Triangle();
                case 2:
                    return new Square();
                case 3:
                    return new Octa();
            }
        }
    }

    class Shapes {
        public static void main(String[] args) {
            Shape[] sh = {new Circle(), new Triangle(), new Square(), new Octa()};
  //          for (int i = 0; i < sh.length; i++)
  //              sh[i] = RandomShapeGenerator.gen();
            for (Shape shp : sh) {
                shp.draw();
                shp.erase();
                shp.adjust();
            }
        }
    }
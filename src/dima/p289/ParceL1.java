package dima.p289;

public class ParceL1 {

    class Contents{
        private int i = 11;
        private int value(){
            return i;
        }
        private ParceL1 getThis(){
            ship(" ");
            return ParceL1.this;
        }
    }

    class Destination{
        private String label;
        private Destination(String label){
            this.label = label;
        }
        private String readLabel(){
            return label;
        }
    }

    private void ship(String label){
        Contents contents = new Contents();
        Destination destination = new Destination(label);
        System.out.println(contents.i+") "+destination.readLabel());
    }

    public Contents getContents(){
        return new Contents();
    }

    public static void main(String[] args) {
        ParceL1 p = new ParceL1();
        p.ship("Canada");
        ParceL1.Contents con = new ParceL1().new Contents();
        con.getThis().ship("Ukraine");
        System.out.println(con.value());
    }
}
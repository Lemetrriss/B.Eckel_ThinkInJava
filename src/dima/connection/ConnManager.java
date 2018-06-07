package dima.connection;
public class ConnManager {
    private static Connection[] c = new Connection[10];

    public static void main(String[] args) {
        new ConnManager().create();
        for(int i=0; i<c.length; i++) {
            if(c[i]!=null) {System.out.println(c[i]+""+i);
            } else {
                System.out.println(c[i]);
            }
        }
    }
    void create() {
        for (int i = 0; i < c.length; i++) {
            c[i] = Connection.makeConn(i);
        }
    }
}

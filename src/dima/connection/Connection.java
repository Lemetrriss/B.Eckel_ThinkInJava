package dima.connection;
class Connection {

    private Connection(){}
    private static int id=8;

    public static Connection makeConn(int n){
        if(n<=id)
            return new Connection();
        return null;
    }
    @Override
    public String toString(){
        return "Connection ";
    }
}
package dima.p209;
    class Simple {
    private String s;
    private Simple(String s){
        this.s=s;
    }
    public static Simple make(String str){
        return new Simple(str);
    }
    @Override
    public String toString(){
        return s;
    }
}

package dima.p209;

    class Second {
        private String s;
        Second(String s){
            this.s=s;
        }
        Simple ss;
        Simple create(){
            if(ss==null) {
                ss = Simple.make(s);
                System.out.println("Creating Simple object");
            }
            return ss;
        }
        public String toString(){
            return create().toString();
        }

        public static void main(String[] args) {
            System.out.println(new Second("inside Second"));
        }
}

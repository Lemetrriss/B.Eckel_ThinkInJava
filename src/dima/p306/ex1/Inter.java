package dima.p306.ex1;

interface Inter {
    void print();
    static class Inner implements Inter{
        private String s;
        protected Inner(String s){
            this.s = s;
        }
        @Override
        public void print(){
            System.out.println(s);
        }
    }
}

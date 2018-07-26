package dima.p310;

class Cally2 extends MyIncrement {
    private int i;

    void increment(){
        super.increment();
        i++;
        System.out.println(i);
    }
    private class Closure implements Incrementable{
        @Override
        public void increment() {
            Cally2.this.increment();
        }
    }
    Incrementable getCallBackReference(){
        return new Closure();
    }
}

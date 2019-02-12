package dima.p310;

class Cally2 extends MyIncrement {
    private int i;
    private void increment1(){
        super.increment();
        i++;
        System.out.println(i);
    }
    private class Closure implements Incrementable{
        @Override
        public void increment() {
            Cally2.this.increment1();
        }
    }
    Incrementable getCallBackReference(){
        return new Closure();
    }
}

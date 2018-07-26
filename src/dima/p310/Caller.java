package dima.p310;

class Caller {
    private Incrementable callBackReference;
    Caller(Incrementable in){callBackReference = in;}
    void go(){callBackReference.increment();}
}
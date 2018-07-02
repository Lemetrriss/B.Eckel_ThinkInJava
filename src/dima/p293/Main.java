package dima.p293;

import dima.p289.Sequence;

class Main {
    public static void main(String[] args) {
        Sequence sq = new Outer().getSequence("Hello");

        System.out.println(sq);
    }
}

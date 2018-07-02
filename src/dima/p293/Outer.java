package dima.p293;

import dima.p289.Sequence;

class Outer {
    private class Inner extends Sequence{
        private String str;

        Inner(String str) {
            super(10);
            this.str = str;
        }

        @Override
        public String toString() {
            return Outer.this.getClass().getSimpleName()+"."+getClass().getSimpleName()+" - "+ str + '\'';
        }
    }

    public Sequence getSequence(String string){
        return new Inner(string);
    }

    protected class Inner2{
        private String str2;

        private Inner2(String str2) {
            this.str2 = str2;
        }

        @Override
        public String toString() {
            return "Inner2{" +
                    "str2='" + str2 + '\'' +
                    '}';
        }
    }
}
